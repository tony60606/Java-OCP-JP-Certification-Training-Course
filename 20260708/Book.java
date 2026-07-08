/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class Book {
    //物件成員屬性
    public int a = 1 ;
    
    //類別成員屬性
    public static int b = 100 ;
    
    //物件成員方法：物件建立後透過物件呼叫的方法
    
    public void show() {
        System.out.println("物件成員屬性a：" + a);
        System.out.println("類別成員屬性b：" + b);
        
    }
    
    //類別成員方法：透過類別名稱呼叫的方法
    public static void showb(){
        //System.out.println("a："+a);類別成員不能呼叫物件成員
        System.out.println("b；" + b);
    }
}
