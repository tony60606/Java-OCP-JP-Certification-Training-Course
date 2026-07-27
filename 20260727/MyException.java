/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
//自訂例外型別，必須繼承一個例外父類別
public class MyException extends Exception{
    //屬性
    private int errnum ;
    //建構子
    public MyException(String message,int errnum) {
        super(message) ;
        this.errnum = errnum ;
    
    
    }
    //方法

    @Override
    public String toString() {
        return "系統發生錯誤，錯誤代碼：" + errnum + "，請將錯誤代碼告知系統管理員";
    }
    
    
}
