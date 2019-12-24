package com.example.group4.Utils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel
public class Book {
    @ApiModelProperty(value = "图书ID",required = true)
    private int id;
    @ApiModelProperty(value = "书名")
    private String name;
    @ApiModelProperty(value = "作者")
    private String author;
    @ApiModelProperty(value = "是否在库")
    private boolean isExist;

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", isExist=" + isExist +
                '}';
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
