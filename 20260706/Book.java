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
    public String ID ;
    public String name ;
    public double price ;
    private double cost ;
    private LocalDate date = LocalDate.now() ;
    
    //無參數建構子
    public Book() {
        System.out.println("無參數建構子Book建立");
    }
    
    //有參數建構子
    public Book(String ID,String name,double price){
        System.out.println("使用有參數建構子建立Book物件");
        //呼叫類別內部方法來指定值
        getvalue(ID,name,price) ;
    }
    
    public void booking(){
        System.out.println("bookID：" + ID);
        System.out.println("bookname：" + name);
        System.out.println("bookprice：" + price);
        System.out.println("bookcost：" + cost);
        System.out.println("date：" + date);
    
    }
    
    public void getcost(double c){
        this.cost = c ;
    }
    
    public void getnewprice(double p) {
        if (p > 0) {
            this.price = price * p ;
        } else {
            this.price = price ;
        }
    }
    
    public void getvalue(String ID,String name,double price) {
        this.ID = ID ;
        this.name = name ;
        this.price = price ;
    }
}
