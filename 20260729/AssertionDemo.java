/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Scanner;

/**
 *
 * @author ttoon
 */
public class AssertionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in) ;
        System.out.println("請輸入一個正整數：");
        int a = sc.nextInt() ;
        dotest(a) ;
    }
    
    private static void dotest(int a) {
        if (a > 0) {
            System.out.println("輸入的正整數為：" + a);
        } else if (a == 0) {
            System.out.println("輸入的正整數為：" + a);
        } else {
            //Assertion斷言
            assert a >= 0 : "輸入值必須大於0" ;
        }
    }
    
}
