/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
//外部類別
public class OuterClass {
    private int a = 1 ;
    
    
    
    public void test1(){
        InnerClass Inner = new InnerClass() ;
        System.out.println("Inner.b = " + Inner.b);
        Inner.test2();
    }
    
    private class InnerClass {
        private int b = 2 ;
        
        public InnerClass() {
            System.out.println("InnerClass建構子");
        }
        
        public void test2() {
            System.out.println("InnerMethod");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
