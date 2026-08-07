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
        System.out.println("-----------");
        System.out.println("使用方法參照 : lambda表達式指呼叫一個方法");
        list.forEach(System.out :: println);
        System.out.println("-----------");
        System.out.println("使用自訂類別中的類別成員方法");
        list.forEach(s -> test1.display(s));
        System.out.println("\n----------------------");
        list.forEach(test1 :: display);
        System.out.println("\n----------------------");
        System.out.println("使用自訂類別中的物件成員方法");
        test1 t = new test1();
        list.forEach(s -> t.show(s));
        System.out.println("\n----------------------");
        list.forEach(t :: show);
        System.out.println("\n----------------------");
        
        System.out.println("使用建構子");
        msg msg1 = s -> new print("使用lambda") ;
        print p1 = msg1.agg("使用lambda") ;
        p1.show();
        
        msg msg2 = print :: new ;
        print p2 = msg2.agg("使用方法參照") ;
        p2.show(); 
        
        msg msg3 = print :: new ;
        msg3.agg("lambda").show() ;
        
    }
    
}
