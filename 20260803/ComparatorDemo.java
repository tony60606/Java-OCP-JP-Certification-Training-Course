/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author student
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList() ;
        stu.add(new Student("Andy",123123,4.25)) ;
        stu.add(new Student("Eily",234234,3.72)) ;
        stu.add(new Student("Tommy",345345,5.25)) ;
        stu.add(new Student("Candy",456456,2.28)) ;
        stu.add(new Student("Sandy",567567,6.315)) ;
        stu.add(new Student("Aline",789789,2.29)) ;
        display(stu) ;
        System.out.println("-----------------------");
        System.out.println("依照姓名排序");
        stu.sort(new studentname());
        display(stu) ;
        System.out.println("-----------------------");
        System.out.println("依照姓名排序");
        stu.sort(new StudentID());
        display(stu) ;
        
        
        
    }

    private static void display(ArrayList<Student> stu) {
        for(var a :stu){
            System.out.println(a);
        }
        System.out.println("---------------------------");
    }

    private static class StudentID implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return Integer.valueOf(o1.getID()).compareTo(o2.getID()) ;
        }
        
    
    
    }
}
