/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class SetDemo {
    public static void main(String[] args) {
        
        
        //Set：無順序，不可重複
        HashSet<Integer> int1 = new HashSet();
        System.out.println("加入11：" + int1.add(11));
        System.out.println("加入81：" + int1.add(81));
        System.out.println("加入90：" + int1.add(90));
        System.out.println("加入12：" + int1.add(12));
        System.out.println("加入11：" + int1.add(11));
        System.out.println("加入18：" + int1.add(18));
        System.out.println("加入61：" + int1.add(61));
        System.out.println("加入110：" + int1.add(110));
    
        for(int i : int1) {
            System.out.println(i + " ");
        }
        System.out.println("\n----------------------");
        
        //不可重複，會自動排序的集合
        TreeSet<Integer> int2 = new TreeSet();
        System.out.println("加入11：" + int2.add(11));
        System.out.println("加入81：" + int2.add(81));
        System.out.println("加入90：" + int2.add(90));
        System.out.println("加入12：" + int2.add(12));
        System.out.println("加入11：" + int2.add(11));
        System.out.println("加入18：" + int2.add(18));
        System.out.println("加入61：" + int2.add(61));
        System.out.println("加入110：" + int2.add(110));
        
        for(int i : int2) {
            System.out.println(i + " ");
        }
        System.out.println("\n----------------------");
        
        Iterator a = int1.iterator();
        while (a.hasNext()){
            System.out.print(a.next() + "|");
        }
        System.out.println("\n-------------------------");
        
        
    }
    
    
}
