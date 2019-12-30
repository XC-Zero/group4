package com.example.group4.wx.controller;


import com.example.group4.wx.util.MSSQLUtil;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.example.group4.wx.common.GetData.getSqlServerData;


@Controller
public class FromSQLServer {
    @ApiImplicitParam(name = "PO_NO",dataType = "int")
    @RequestMapping(value = {"From"}, method = RequestMethod.GET)
    public static String wxPayList(String PO_NO) {
        MSSQLUtil.setPoNo(PO_NO);
        System.out.println(PO_NO);


//        getSqlServerData();
        if(getSqlServerData(PO_NO)){
            if (MSSQLUtil.getPoState().isEmpty()||MSSQLUtil.getPoState()==null||MSSQLUtil.getPoState()=="null"){
                return "redirect:/H";
            }
            else if (MSSQLUtil.getPoState().trim().equals("微信付款成功")||MSSQLUtil.getPoState().trim().equals("支付宝付款成功")
                    ||MSSQLUtil.getPoState().trim().equals("微信支付成功")||MSSQLUtil.getPoState().trim().equals("支付宝支付成功")){
                return "hasPaid.html";
            }
            else if(MSSQLUtil.getPoState().trim().equals("null")||MSSQLUtil.getPoState().trim().equals("待付款")||
                    MSSQLUtil.getPoState().trim().equals("待支付")
                    ||MSSQLUtil.getPoState().equals(null)||MSSQLUtil.getPoState().trim().equals("微信付款失败")
                    ||MSSQLUtil.getPoState().trim().equals("支付宝付款失败"))
            {
                return "redirect:/H";
            }
            else {
                return "Error.html";
            }
        }
        else{
            return "Error.html";
        }
    }

}
