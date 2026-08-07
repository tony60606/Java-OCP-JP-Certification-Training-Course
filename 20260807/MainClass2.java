/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Optional;

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
        String name = getname(0) ;
        
        if (name != null) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("name是null");
        }
        
        //使用option
        Optional<String> name1 = Optional.ofNullable(getname(1)) ;
        
        System.out.println("name1 = " + name1);
        
        name1.ifPresent(s -> System.out.println(s.toUpperCase()));
        System.out.println("-------------------");
        name1.ifPresentOrElse(s -> System.out.println(s.toUpperCase()) , () -> System.out.println("name1是null"));
    }
    
    
    private static String getname(int i) {
        if (i == 0) {
            return null ;
        } else {
            return "pythod" ;
        }
    
    }
}
