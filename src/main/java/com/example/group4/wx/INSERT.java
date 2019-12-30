package com.example.group4.wx;

import java.sql.*;

public class INSERT {
    private static String user = "group4";
    private static String pwd = "CJMcjm136466!";
    private static String url = "jdbc:mysql://test-group4.mysql.rds.aliyuncs.com:9988/group4_2?useunicode=true;&characterEncoding=utf8";
    static Connection conn=null;
    public static void insertInTo(String outTradeNo,String transactionId,String payDate,Double Fee){
        String time=payDate;//支付完成时间
        String Pay_Id=transactionId;//微信支付订单号
        String order_id=outTradeNo;//商户订单号

        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection(url, user, pwd);
            String sql = "insert into  weixin_history "+"(OrderId,DealTime,InvoiceId,Amount)"+" VALUE "+"("+order_id+","+time+","+Pay_Id+","+Fee+")";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();
System.out.println("SUCCESS");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    }

