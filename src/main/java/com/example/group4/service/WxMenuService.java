package com.example.group4.service;


public interface WxMenuService {



    String wxPayUrl(Double totalFee, String outTradeNo, String signType, String GoodsName) throws Exception;


}
