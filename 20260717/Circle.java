/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class Circle extends Shape{
    public static final double PI = Math.PI ;
    private double radiues ;
    
    public Circle(){
        System.out.println("Circle子類別無參數建構子....");
    }

    public double getRadiues() {
        return radiues;
    }

    public void setRadiues(double radiues) {
        this.radiues = radiues;
    }
    

    @Override
    public double Area() {
        return Math.pow(radiues,2 ) * PI ;
    }
    
    
}
