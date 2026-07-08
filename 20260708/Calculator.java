/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class Calculator {
    //方法多載
    public static double sum(int a , double b){
        System.out.println("sum(int a , double b)");
        return a + b ;
    }
    public static int sum(int a , int b){
        System.out.println("sum(int a , int b)");
        return a + b ;
    }
    public static double sum(double a , int b){
        System.out.println("sum(double a , int b)");
        return a + b ;
    }
}
