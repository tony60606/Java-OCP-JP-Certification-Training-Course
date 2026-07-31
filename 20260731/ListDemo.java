/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author student
 */
public class ListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> int1 = new ArrayList();
        int1.add(new Integer(1)) ; //JAVA5.0以前，boxing裝箱(int->integer)，不建議使用
        int1.add(20) ; //JAVA5.0以後，autoboxing
        int1.add(Integer.valueOf(30)) ; //autoboxing 自動裝箱 
        int1.add(Integer.valueOf("40")) ; //valueOf可以存取字串型態的整數
        
        System.out.println("int1 = " + int1);
        
        Integer int2 = int1.get(0) ; //取出int1的資料
        int a = int2.intValue() ; //JAVA5.0前unboxing拆箱(Integer->int)
        System.out.println("a = "+ a);
        int b = int1.get(1) ; //JAVA5.0以後 auto-unboxing 自動拆箱
        System.out.println("b = "+ b);
        
        //用迭代器取出集合資料
        Iterator it = int1.iterator() ; //將int1的資料複製一份到iterator內
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
