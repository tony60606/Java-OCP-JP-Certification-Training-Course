/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book A1 = new Book() ;
        System.out.println("A1：");
        A1.show();
        System.out.println("----------------");
        
        Book A2 = new Book() ;
        System.out.println("A2：");
        A2.show();
        System.out.println("----------------");
        
        //呼叫API現成類別成員
        System.out.println("int的最大值：" + Integer.MAX_VALUE);
        System.out.println("圓周率：" + Math.PI);
        System.out.println("平方根：" + Math.sqrt(4.0));
        System.out.println("次方：" + Math.pow(3, 5));
        System.out.println("亂數：" + Math.random());
        
    }
    
}
