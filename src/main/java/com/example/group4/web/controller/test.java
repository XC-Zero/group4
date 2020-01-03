package com.example.group4.web.controller;


import com.example.group4.bean.Survey;
import com.example.group4.bean.ex.ChecksurveyEX;
import com.example.group4.bean.ex.ChecksurveyREX;
import com.example.group4.bean.ex.SurveyEX;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
public class test {

    @GetMapping("download")
    public void excell(HttpServletResponse response) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook( );

        XSSFSheet sheet=workbook.createSheet("客调信息");  //创建表

        //创建工作表

        //创建行
        XSSFRow row=sheet.createRow(0);
        //设置单元格
        XSSFCell cell=row.createCell(0);

//设置单元格类型
        cell.setCellType(CellType.STRING);
        //设置单元格内容
        cell.setCellValue("今天天气很好");

        //将表格返回给浏览器

        XSSFCell rowcell=row.createCell(1);
        rowcell.setCellType(CellType.STRING);
        rowcell.setCellValue("lisi");

        //返回的类型
        // 告诉浏览器用什么软件可以打开此文件
//        response.setHeader("content-Type", "application/vnd.ms-excel");
//        // 下载文件的默认名称
//        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(excelName+".xlsx", "utf-8"));

   //     response.setContentType("application/vnd.ms-excel");

        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称

        ;
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode("lisi.xlsx", "utf-8"));

workbook.write(response.getOutputStream());
    }
private ChecksurveyREX checksurveyEX;
    @GetMapping("/download2")
    public  void download2(HttpServletResponse response) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook( );
        XSSFSheet sheet=workbook.createSheet("客调信息");  //创建表
        XSSFRow row=sheet.createRow(1);
        XSSFCell cell=row.createCell(0);
        cell.setCellType(CellType.STRING);
        cell.setCellValue(checksurveyEX.getQuestionnairename());
        sheet.addMergedRegion(new CellRangeAddress(0,0,0,7));
        //第二行
        XSSFRow row2=sheet.createRow(2);
        XSSFCell cell1=row.createCell(0);
        cell1.setCellType(CellType.STRING);
        cell1.setCellValue("hxc");
        XSSFCell cell2=row.createCell(1);
        cell2.setCellType(CellType.STRING);
        cell2.setCellValue("xly");

        response.setHeader("content-Type", "application/vnd.ms-excel");
        // 下载文件的默认名称

        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode("lisi2.xlsx", "utf-8"));
        workbook.write(response.getOutputStream());
    }
}
