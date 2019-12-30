package com.example.group4.wx.controller;

import com.alibaba.fastjson.JSONObject;

import com.example.group4.wx.common.update;
import com.example.group4.wx.config.WxConfig;
import com.example.group4.wx.config.WxConstants;
import com.example.group4.wx.service.WxMenuService;
import com.example.group4.wx.util.MSSQLUtil;
import com.example.group4.wx.util.WxUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@Controller
public class WxPayController {
public static Double Fee=0.01;
public static String GoodsName="test";
    @Autowired
    private WxMenuService wxMenuService;

    /**
     * 二维码首页
     */
    @RequestMapping(value = {"/H"}, method = RequestMethod.GET)
    public String wxPayList(Model model){
        //商户订单号
        MSSQLUtil.setOuter(WxUtil.mchOrderNo());
        return "redirect:/wxPay/payUrl";
    }

//    /**
//     * 获取流水号
//     */
//    @RequestMapping(value = {"wxPay/outTradeNo"})
//    @ResponseBody
//    public String getOutTradeNo(Model model){
//        //商户订单号
//        MSSQLUtil.setOuter(WxUtil.mchOrderNo());
//        return WxUtil.mchOrderNo();
//    }

    final private String signType = WxConstants.SING_MD5;
    /**
     * 统一下单-生成二维码
     */
    @RequestMapping(value = {"wxPay/payUrl"})
    public void payUrl(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String outTradeNo=MSSQLUtil.getOuter();
        int falg=0;
        if(MSSQLUtil.getPrice()!=0&&MSSQLUtil.getPrice()!=null){
            Fee=MSSQLUtil.getPrice();
            falg++;
        }
        if(!(MSSQLUtil.getGoodsName().equals(""))&&MSSQLUtil.getGoodsName()!=null){
            GoodsName=MSSQLUtil.getGoodsName();
            falg++;
        }
        System.out.println(Fee);
        if(falg==2){
        WxUtil.writerPayImage(response,wxMenuService.wxPayUrl(Fee,outTradeNo,signType,GoodsName));
        }

        else {
            Writer writer=response.getWriter();
            writer.write("出错了！！！");
        }

    }
    /**
     * 统一下单-通知链接
     */
    @RequestMapping(value = {"wxPay/unifiedorderNotify"})
    public void unifiedorderNotify(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int i=0;
        i++;
System.out.println("统一下单-通知链接"+i);
        //商户订单号
        String outTradeNo =null;
        String xmlContent = "<xml>" +                "<return_code><![CDATA[FAIL]]></return_code>" +
                "<return_msg><![CDATA[签名失败]]></return_msg>" +
                "</xml>";
        try{
            String requstXml = WxUtil.getStreamString(request.getInputStream());
            System.out.println("requstXml : " + requstXml);
            Map<String,String> map = WxUtil.xmlToMap(requstXml);
            String returnCode= map.get(WxConstants.RETURN_CODE);
            String status=null;
            //校验一下 ，判断是否已经支付成功
            if(StringUtils.isNotBlank(returnCode) && StringUtils.equals(returnCode,"SUCCESS")
                    &&  WxUtil.isSignatureValid(map, WxConfig.key,signType)){
                status="微信支付成功";
                //商户订单号
                outTradeNo = map.get("out_trade_no");
                System.out.println("outTradeNo : "+ outTradeNo);
                //微信支付订单号
                String transactionId = map.get("transaction_id");
                System.out.println("transactionId : "+ transactionId);
                MSSQLUtil.setWeixinID(transactionId);
                //支付完成时间
                SimpleDateFormat payFormat= new SimpleDateFormat("yyyyMMddHHmmss");
                Date payDate = payFormat.parse(map.get("time_end"));

                SimpleDateFormat systemFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String time=systemFormat.format(payDate);
                System.out.println("支付时间：" + time);
                MSSQLUtil.setDealdate(time);

                update.updateData(MSSQLUtil.getPoNo(),status);

                //临时缓存

                WxConfig.setPayMap(outTradeNo,"SUCCESS");
                xmlContent = "<xml>" +
                        "<return_code><![CDATA[SUCCESS]]></return_code>" +
                        "<return_msg><![CDATA[OK]]></return_msg>" +
                        "</xml>";
            }
            else {
                status="微信支付失败";
                update.updateData(MSSQLUtil.getPoNo(),status);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        WxUtil.responsePrint(response,xmlContent);
    }

    /**
     * 定时器查询是否已支付
     */
    @RequestMapping(value = {"wxPay/payStatus"})
    @ResponseBody
    public String payStatus(@RequestParam(value = "outTradeNo")String outTradeNo){
        JSONObject responseObject = new JSONObject();
        String outTradeNoValue = WxConfig.getPayMap(outTradeNo);
        String status = "200";
        //判断是否已经支付成功
        if(StringUtils.isNotBlank(outTradeNoValue) && StringUtils.equals(outTradeNoValue,"SUCCESS")){
            status = "0";
//            INSERT.insertInTo(outTradeNo,MSSQLUtil.getWeixinID(),MSSQLUtil.getDealdate(),MSSQLUtil.getPrice());
//            update.updateData(MSSQLUtil.getPoNo());
        }
        responseObject.put("status",status);
        System.out.println(responseObject);
        System.out.println();
        return responseObject.toJSONString();
    }





}
