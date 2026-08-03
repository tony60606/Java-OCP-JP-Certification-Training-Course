/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.TreeSet;

/**
 *
 * @author student
 */
public class ComparableDemo {
    public static void main(String[] args) {
        
        TreeSet<String> str  = new TreeSet() ;
        str.add("一") ;
        str.add("二") ;
        str.add("三") ;
        str.add("四") ;
        str.add("五") ;
        System.out.println(str);
        
        //自訂類別建立TreeSet，
        TreeSet<Student> stu = new TreeSet() ;
        stu.add(new Student("Andy",123123,4.25)) ;
        stu.add(new Student("Eily",234234,3.72)) ;
        stu.add(new Student("Tommy",345345,5.25)) ;
        stu.add(new Student("Candy",456456,2.28)) ;
        stu.add(new Student("Sandy",567567,6.315)) ;
        stu.add(new Student("Aline",789789,2.29)) ;
        for(var a :stu){
            System.out.println(a);
        }
    }
}
