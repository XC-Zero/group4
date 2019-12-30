package com.example.group4.wx.common;

import com.example.group4.wx.util.MSSQLUtil;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class GetData {
    private static String user = "group4";
    private static String pwd = "CJMcjm136466!";
    private static String url = "jdbc:mysql://test-group4.mysql.rds.aliyuncs.com:9988/wx_test?useunicode=true;&characterEncoding=utf8";
    private static String   sql;

    static Connection conn=null;
    static ResultSet rs = null;
    static PreparedStatement pstmt=null;
    static Map<String,String> map;
    public static boolean getSqlServerData(String PO_NO)    {
        map=new HashMap<>();
        sql="select po_no,sys_name,prd_name,price,po_state from po where PO_NO = '"+PO_NO+"'" ;
        try {
            //加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            conn = DriverManager.getConnection(url, user, pwd);
            pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            rs = pstmt.executeQuery();

            while (rs.next())
            {
                    map.put("sys_name",rs.getString("sys_name"));
                    map.put("prd_name",rs.getString("prd_name"));
                    map.put("price",rs.getString("price"));
                    map.put("po_state",rs.getString("po_state"));
            }
            if(map.containsKey("sys_name")){
                MSSQLUtil.setSystemName(map.get("sys_name"));
                System.out.println(MSSQLUtil.getSystemName());
            }
            if(map.containsKey("prd_name")){
                MSSQLUtil.setGoodsName(map.get("sys_name")+""+map.get("prd_name"));
                System.out.println(MSSQLUtil.getGoodsName());
            }
            if(map.containsKey("price")){
                MSSQLUtil.setPrice(Double.parseDouble(map.get("price")));
                System.out.println(MSSQLUtil.getPrice());
            }
            if(map.containsKey("po_state")){
                MSSQLUtil.setPoState(map.get("po_state"));
                System.out.println(MSSQLUtil.getPoState());
            }
            if (!(rs.next())){
                System.out.println("result is empty!!!!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(map.isEmpty()){
            System.out.println("map is empty!!!");
            return false;
        }
        System.out.println(map);
        return true;
    }
}