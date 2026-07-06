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
        Book2 A1 = new Book2() ;
        System.out.println("A1：");
        A1.show();
        System.out.println("----------------");
        
        Book2 A2 = new Book2() ;
        System.out.println("A2：");
        A2.show();
        System.out.println("----------------");
        
        System.out.println(System.identityHashCode(A1));
        System.out.println(System.identityHashCode(A2));
        System.out.println("----------------");
        //修改A1物件的物件成員a
        A1.a = 2 ;
        //修改A1物件的類別成員b
        A1.b = 101 ;
        A1.show();
        A2.show();
        System.out.println(System.identityHashCode(A1.a));
        System.out.println(System.identityHashCode(A1.b));
        System.out.println(System.identityHashCode(A2.a));
        System.out.println(System.identityHashCode(A2.b));
        System.out.println("----------------");
        Book2.showb();
        A2.b = 102 ;
        Book2.showb();
    }
    
}
