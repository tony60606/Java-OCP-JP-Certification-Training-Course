/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class MainClass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //var：只能宣告在區域變數or區塊，並明確給值 ==> JAVA 10
        var a = 100 ; //int
        var p = 3.14 ; // double
        var A = a * a * p ; //double
        var p2 = Math.PI ;
        System.out.printf("A = %.2f%n",A);
        
        //晉升
        var c = (byte) 15 ; //屬性從int轉byte 只能用-128~127
        System.out.println("c ：" + c);
        c = 127 ;
        System.out.println("c ：" + c);
        
        var f = "JAVA" ; //String
        System.out.println("f ：" + f.toLowerCase());
        
        
        //for迴圈
        var sum = 0 ;
        for(var i = 0 ; i < 15 ; i++) {
            sum += i ;
        }
        System.out.println("sum = " + sum);
        
        //陣列
        int[] j = {2,4,6} ;
        var k = new int[]{1,3,5,7} ;
        System.out.println(Arrays.toString(j));
        System.out.println(Arrays.toString(k));
    }
    
}
