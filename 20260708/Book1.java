/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class Book1 {
    String name ;
    int price ;
    public Book1(String name, int price){
        this.name =  name ;
        this.price = price ;
    }
    
    public String getvalue(){
        return String.format("書名：%s，價格：%d",name, price) ;
    }
}
