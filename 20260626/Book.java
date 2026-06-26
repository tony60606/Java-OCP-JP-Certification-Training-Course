/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.samole;

import java.time.LocalDateTime;

/**
 *
 * @author ttoon
 */
public class Book {
    //屬性(變數)--類別內，方法外：物件特徵
    public String name ; //public --公開
    public int price ;
    private LocalDateTime datetime ; //private --私有不對外公開
    
    //建構子(建構函數)：建立物件時被呼叫，用來初始化物件
    public Book() {
        System.out.println("新書籍物件建立");
    }
    //方法：物件操作
    public void display() {
        datetime = LocalDateTime.now() ;//建立datetime物件，並指定當下時間
        
        //顯示相關資料
        System.out.println("書名："+name);
        System.out.println("售價："+price);
        System.out.println("查詢時間："+datetime);
    
    }
    


    
    
}
