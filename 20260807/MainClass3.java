/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

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
        Person p1 = new Person.Builder().build() ; //沒有呼叫收集資料方法
        System.out.println("p1 : " + p1);
        Person p2 = new Person.Builder().City("高雄").name("Andy").age(30).build();
        System.out.println("p2 : " + p2);
    }
    
}
