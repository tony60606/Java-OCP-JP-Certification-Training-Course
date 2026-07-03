/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.time.LocalDate;

/**
 *
 * @author student
 */
public class Book {
    //宣告屬性
    //--------------------------
    //物件建立當下，屬性初始化的方式：
    //1.使用預設值
    //2.明確指定
    //3.使用建構子
    
    //公開物件成員
    public String Id ;
    public String name ;
    public double price ;
    //私有物件成員
    private double cost ;
    private LocalDate date = LocalDate.now() ;
    
    //建構子
    
    
    //方法
    //物件成員方法(無回傳值、無參數)
    public void Bookstore() {
        System.out.println("書本ID：" + Id);
        System.out.println("書本名稱：" + name);
        System.out.println("書本價格：" + price);
        System.out.println("書本成本：" + cost);
        System.out.println("查閱時間：" + date);
        System.out.println("--------------------");
    }
    //物件成員方法：無回傳值，有參數
    public void setcost(double c) {  //c 是方法的參數，負責接收資料交給方法內部運作
        //先檢查方法參數c的值是否是正確
        if (c >= 0) {
            cost = c ; 
        } else {
            cost = 0.0 ;
        }
    }
    //物件成員方法：有回傳值，有參數
    //計算新售價，並將計算結果利用return回傳給呼叫端
    public double getnewprice(double p){
        System.out.println("計算新售價");
        return this.cost * p ; //this
    }
    
    //物件成員方法：無回傳值，有多個參數
    //設定多個屬性值
    public void seting(String Id,String name,int price) {
        this.Id = Id ; //將參數指定給這個物件成員(this.物件成員)
        this.name = name ; //一般程式設計，物件成員名稱會跟參數名稱相同，以利清楚指定
        this.price = price ;
    }
    
}
