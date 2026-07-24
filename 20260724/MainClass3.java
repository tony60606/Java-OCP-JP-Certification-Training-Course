/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        
        ArrayList test1 = new ArrayList<String>() ; //參數是Object型別
        List test2 = test1 ;//參數是Object型別
        
        var test3 = new ArrayList() ;//參數是Object型別
        var test4 = test3 ;//參數是Object型別
        
        var test5 = new ArrayList<String>() ; //參數是String型別
        var test6 = test5 ;//參數是String型別
        
        List test7 = test5 ;
        var test8 = (List)test5 ;
        //test7.test8都是List型態，參數都是Object型別
        
        System.out.println("---------------------");
        String [] name = {"Liam","Olivia","Noah","Emma","Oliver","Ava","James","Sophia"} ;
        List<String> test9 = Arrays.asList(name);
        System.out.println("test9 ：" + test9);
        ArrayList<String> str1 = new ArrayList(test9) ;
        System.out.println("str1：" + str1);
        var str2 = new ArrayList(test9) ;
        System.out.println("str2：" + str2);
        //綜合
        ArrayList<String> str3 = new ArrayList(Arrays.asList(name)) ;
        System.out.println("str3：" + str3);
        System.out.println("---------------------");
        var str4 = new ArrayList<String>(Arrays.asList(name)) ;
        //將內容全部轉大寫
        System.out.println("這是假象(單純印出，未直接改到資料)");
        
        for(var a : str4) {
            System.out.printf("%s | ",a.toUpperCase());
        }
        System.out.println("\n-------------------------------");
        System.out.println("迴圈後資料：" + str4);
        
        System.out.println("方法一：get+set轉成大寫");
        
        for (int b = 0 ; b < str4.size() ; b++) {
            str4.set(b, str4.get(b).toUpperCase()) ;
        }
        System.out.println("迴圈後資料：" + str4);
        System.out.println("-----------------------------");
        System.out.println("方法二：lambda轉成小寫");
        str4.replaceAll(s -> s.toLowerCase());
        System.out.println("lambda後資料：" + str4);
        System.out.println("-----------------------------");
        System.out.println("用lambda將o開頭的字串移除");
        str4.removeIf(s -> s.startsWith("o")) ;
        System.out.println("lambda後資料：" + str4);
        str4.removeIf(s -> s.length()>4) ;
        System.out.println("lambda後資料：" + str4);
        
        
    }
    
}
