package com.example.group4.wx.common;

import com.example.group4.wx.util.MSSQLUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/image")
public class imageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>IMAGE</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<img src=\"/wxPay/payUrl?outTradeNo="+ MSSQLUtil.getOuter() +"\">");
        out.println("</body>");
        out.println("</html>");
    }
}
