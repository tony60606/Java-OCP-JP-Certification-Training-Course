/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.ArrayDeque;

/**
 *
 * @author student
 */
public class QueueDemo {
    public static void main(String[] args) {
        System.out.println("先進先出");
        ArrayDeque<String> man = new ArrayDeque() ;
        man.add("Ethan");
        man.add("Ethan");
        man.add("Oliver");
        man.add("Ian");
        man.add("Leo");
        man.add("Lucas");
        man.add("Leo");
        System.out.println("man = " + man);
        System.out.println("man.remove() = " + man.remove());
        System.out.println("man = " + man);
        while (!man.isEmpty()) { //判斷是否為空集合 
            System.out.println("man.remove() = " + man.remove());
            System.out.println("man = " + man);
        }
        System.out.println("------------------------------");
        System.out.println("後進先出");
        ArrayDeque<String> woman = new ArrayDeque() ;
        woman.push("Chloe");
        woman.push("Mia");
        woman.push("Mia");
        woman.push("Chloe");
        woman.push("Emma");
        woman.push("Chloe");
        System.out.println("woman = " + woman);
        while (!woman.isEmpty()) { //判斷是否為空集合 
            System.out.println("woman.pop() = " + woman.pop());
            System.out.println("woman = " + woman);
        }
        
    }
}
