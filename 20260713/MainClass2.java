/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class MainClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle cir = new circle() ;
        cir.setRadius(5);
        cir.getArea() ;
        System.out.println("radius = " + cir.getRadius());
        System.out.println("pi = " + cir.pi);
        System.out.println("Area = " +cir.getArea()) ;
        System.out.println("-------------");
        circle cir2 = new circle() ;
        cir2.setRadius(-50);
        System.out.println("radius = " + cir2.getRadius());
        System.out.println("pi = " + cir2.pi);
        System.out.println("Area = " +cir2.getArea()) ;
        
    }
    
}
