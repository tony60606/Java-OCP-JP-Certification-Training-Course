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
        cir.redius = 5 ;
        cir.pi = 6 ;
        System.out.println("redius = " + cir.redius);
        System.out.println("pi = " + cir.pi);
        System.out.println("Area = " +cir.getArea()) ;
    }
    
}
