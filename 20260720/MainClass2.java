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
        
        System.out.println("------------------");
        
        Airplane airplane1 = new Airplane("戰鬥機") ;
        airplane1.setSeat(200);
        airplane1.flying();
        
        System.out.println("------------------");
        
        Fly airplane2 = new Airplane("老式機") ;
        ((Airplane)airplane2).setSeat(150);
        airplane2.flying();
        
        showflying(eagle) ;
        showflying(eagle2) ;
        showflying(airplane1) ;
        showflying(airplane2) ;
        
        
        
    }
    
    private static void showflying(Fly obj) {
        obj.flying();
        System.out.println("------------------") ;
    }
    
}
