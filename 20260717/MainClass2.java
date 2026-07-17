/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public class MainClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Eagle eagle = new Eagle("老鷹") ;
        eagle.flying();
        
        System.out.println("------------------");
        
        Fly eagle2 = new Eagle("禿鷹") ;
        eagle2.flying();
    }
    
}
