/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
// 自訂類別中若無 extends 敘述，預設繼承Object父類別
// 抽象類別 => 規範.訂定通用契約，定義子類別需要的屬性&方法
//         =>抽象類別不可被建立成物件
public abstract class Shape {
    
    //屬性
    private String type ;
    private String color ;
    
    //建構子
    public Shape() {
        System.out.println("無參數建構子....");
    }
    
    //有參數建構子
    public Shape(String type , String color) {
        System.out.println("Shape有參數建構子");
        this.type = type ;
        this.color = color ;
    }
    
    
    //具體方法
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void drow() {
        System.out.println("繪製形狀....");
    }
    
    //定義抽象方法：
    //1.無具體內容的方法(無{})，使用;結束
    //2.抽象方法的具體內容由子類別完成描述
    
    public abstract double Area() ;
    
}
