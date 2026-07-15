/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class Rectangle extends Shape {
    private double height , weight ;
    
    public Rectangle() {
        System.out.println("Rectangle子類別無參數建構子....");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double Area() {
       return  height * weight; 
    }
    
    
    
    //父類別方法不夠子類別使用，使用Override來複寫父類別的方法(重新定義父費別方法)
    //父類別，子類別宣告相同方法，執行時會以子類別優先
    @Override
    public void drow() {
        super.drow(); 
        System.out.println("圖形：" + getType());
        System.out.println("顏色：" + getColor());
        System.out.println("高度：" + getHeight());
        System.out.println("寬度：" + getWeight());
        System.out.printf("面積：%f%n",Area());
    }

    
    
    
}
