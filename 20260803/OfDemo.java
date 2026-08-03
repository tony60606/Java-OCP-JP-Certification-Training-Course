/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.entry; //import static 靜態引用

/**
 *
 * @author student
 */
public class OfDemo {
    public static void main(String[] args) {
        
        //List:可重複，不可修改，可放0~多個值(超過10個值可用.of(陣列))
        List<String> oneteachername = List.of("Ethan", "Oliver", "Lucas", "Leo", "Asher", "Ian" ,"Ethan", "Oliver", "Lucas", "Leo") ;
        System.out.println("oneteachername = " + oneteachername);
        Integer [] age = {18, 34, 56, 23, 45, 61, 28, 42, 50, 37, 19, 64, 55, 31, 48} ;
        List<Integer> oneteacherage = List.of(age) ;
        System.out.println("oneteacherage = " + oneteacherage );
        System.out.println("-----------------------");
        //Set:不可重複，不可修改，可放0~多個值(超過10個值可用.of(陣列))
        Set<String> twoteachername = Set.of("Emma", "Chloe", "Mia", "Lily", "Sophia", "Ella" ,"Harper", "Evelyn", "Scarlett", "Grace") ;
        System.out.println("twoteachername = " + twoteachername);
        Integer [] twoage = {19, 44, 62, 25, 33, 51, 58, 22, 47, 36, 60, 27, 41, 53, 20} ;
        Set<Integer> twoteacherage = Set.of(twoage) ;
        System.out.println("twoteacherage = " + twoteacherage );
        System.out.println("-----------------------");
        //Map:不可重複，不可修改，可放0~10個值
        Map<String,String> therrteachername = Map.of("A1B", "Oliver", "C2D", "Lucas", "E3F", "Emma", "G4H", "Mia", "I5J", "Ethan", "K6L", "Lily") ;
        System.out.println("therrteachername = " + therrteachername);
        //超過10個值 => 用 Map.ofEntries
        Map<Integer,String> allteacher = Map.ofEntries(
                entry(101, "Mason") ,
                entry(102, "Logan") ,
                entry(103, "Aiden") ,
                entry(104, "Arlo") ,
                entry(105, "Dylan") ,
                entry(106, "Luke") ,
                entry(107, "Owen") ,
                entry(108, "Ryan") ,
                entry(109, "Zoe") ,
                entry(110, "Luna") ,
                entry(111, "Mila") 
        ) ;
        System.out.println("allteacher = " + allteacher );
        System.out.println("-----------------------");
        
        
        Map<String,Student> stu = Map.of("A01", new Student("Andy",123123,4.25)) ;
        System.out.println(stu.values());
    }
}
