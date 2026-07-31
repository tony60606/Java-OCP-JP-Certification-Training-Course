/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class GenericDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Integer [] int1 = {11,30,52,66,7,19,82} ;
        String [] str1 = {"apple","banana","cherry","dragon","elephant","forest"} ;
        
        display(int1) ;
        display(str1) ;
    
    
    }

//    private static void display(Integer[] input) {
//        for (Integer a : input) {
//            System.out.println(a + "|");
//        
//        }
//        System.out.println("\n----------------------------");
//    }
//
//    private static void display(String[] input) {
//        for (String a : input) {
//            System.out.println(a + "|");
//        
//        }
//        System.out.println("\n----------------------------");
//    }
    
    private static <T> void display(T [] input) {
        for (T a : input) {
            System.out.print(a + "|");
        
        }
        System.out.println("\n----------------------------");
    }
    
    
    
    
}
