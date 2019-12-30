package com.example.group4.wx.util;

public class MSSQLUtil {
    public static String getGoodsName() {
        return GoodsName;
    }

    public static void setGoodsName(String goodsName) {
        GoodsName = goodsName;
    }

    public static Double getPrice() {
        return price;
    }

    public static void setPrice(Double price) {
        MSSQLUtil.price = price;
    }

    public static String getPoNo() {
        return PO_NO;
    }

    public static void setPoNo(String poNo) {
        PO_NO = poNo;
    }
    public static String getDealdate() {
        return dealdate;
    }

    public static void setDealdate(String dealdate) {
        MSSQLUtil.dealdate = dealdate;
    }
    public static String getWeixinID() {
        return weixinID;
    }

    public static void setWeixinID(String weixinID) {
        MSSQLUtil.weixinID = weixinID;
    }

    public static String getPoState() {
        return PO_STATE;
    }

    public static void setPoState(String poState) {
        PO_STATE = poState;
    }

    public static String getSystemName() {
        return SystemName;
    }

    public static void setSystemName(String systemName) {
        SystemName = systemName;
    }
    private static String GoodsName;//续费多久，还是买啥（PRD_NAME）
    private static Double price;//价格
    private static String PO_NO;//ID
    private static String dealdate;//交易达成时间
    private static String PO_STATE;//状态
    private static String SystemName;//购买、续费系统名称
    private static String weixinID;
    private static String outer;

    public static String getOuter() {
        return outer;
    }

    public static void setOuter(String outer) {
        MSSQLUtil.outer = outer;
    }
}
