/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
//變數：依宣告位置分類
//(1)屬性：類別內，方法外、(2)參數：方法簽章、(3)區域變數：區塊內或方法內
public class MyClass { //屬性有效範圍開始
    
    //屬性
    public String item ;
    
    //方法
    public void setItem(String it) {//參數有效範圍開始
        
        System.out.println("it = " + it);
        String temp = "項目:" + it; //區域變數有效範圍開始
        System.out.println("temp："+temp);
        item = "工作：" + temp ;
        System.out.println("item：" + item);
        
    }//參數有效範圍結束;//區域變數有效範圍結束
    
    public String getInfo() {
       //System.out.println(it); 嘗試使用方法內參數 - 不可用
       //System.out.println(temp); 嘗試使用方法內區域變數 - 不可用
       String temp = "JAVA" ;
       return item + "," + temp ;
    }
    
    
}//屬性有效範圍結束
