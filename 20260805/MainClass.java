/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author student
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> list = List.of("abc", "efg" , "hij") ;
        System.out.println("簡易方式輸出:");
        System.out.println(list);
        System.out.println("-----------");
        System.out.println("使用增強行迴圈顯式:");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------");
        System.out.println("使用list的for-each方法帶(lambda表達式):");
        Consumer<String> action = t -> System.out.println(t);
        list.forEach(action);
        System.out.println("-----------");
        list.forEach(t -> System.out.println(t));
    }
    
}
