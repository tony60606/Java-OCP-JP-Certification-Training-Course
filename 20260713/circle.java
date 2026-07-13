/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class circle {
    //屬性
    //公開無法修改的類別成員
    public static final double pi = 3.14 ;
    //私有不對外
    private double radius ;
    
    //提供公開操作的介面(方法)：讓外部可以間接操作私有屬性
    //設值：setxxx
    public void setRadius(double radius){
        if (radius >= 0) {
            System.out.println("半徑設定成功");
            this.radius = radius ;
        } else {
            System.out.println("半徑設定失敗");
             this.radius = 0 ;
        }
    }
    //取值：getxxx
    public double getRadius() {
        return radius ;
    }
    
    
    //方法
    public double getArea(){
        return pi * radius * radius ;
    }
}
    
