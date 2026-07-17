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
        Circle circle = new Circle() ;
        circle.setType("圓形");
        circle.setColor("紫色");
        circle.setRadiues(10.8);
        circle.drow();
        System.out.println("圖形：" + circle.getType());
        System.out.println("顏色：" + circle.getColor());
        System.out.println("半徑：" + circle.getRadiues());
        System.out.printf("面積：%f%n",circle.Area());
        System.out.println("----------------------------");
        Rectangle rectangle = new Rectangle() ;
        rectangle.setType("矩形") ;
        rectangle.setColor("棕色") ;
        rectangle.setHeight(30.5);
        rectangle.setWeight(60.4);
        rectangle.drow();
        System.out.println("----------------------------");
        Rectangle rectangle1 = new Rectangle("長方形","黑色") ;
        rectangle1.setHeight(15);
        rectangle1.setWeight(20);
        rectangle1.drow();
        System.out.println("----------------------------");
        Rectangle rectangle2 = new Rectangle("菱形","咖啡色",43.215,30.112) ;
        rectangle2.drow();
    }

    
    
}
