/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
        System.out.println("---------------------------------");
        
        List<Person> list = Person.createList();
        System.out.println("list : " + list);
        
        for (Person p : list) {
            System.out.println(p);
        }
        
        System.out.println("-----------------");
        Consumer<Person> action = p -> System.out.println(p);
        list.forEach(action);
        
        System.out.println("-------------------------------");
        
        for (Person p : list) {
            if(p.getAge() >= 25) {
                System.out.println(p);
            }
        }
        
        System.out.println("-------------------------------");
        Predicate<Person> age25 = p -> p.getAge()>=25 ;
        list.stream().filter(age25).forEach(p -> System.out.println(p));
        System.out.println("---------------");
        list.stream().filter(p -> p.getAge() >= 25).forEach(System.out :: println);
        
        System.out.println("-------------------------------");
        
        Function<Person,String> getname = p -> p.getName();
        list.stream().map(getname).forEach(System.out :: println);
        
        System.out.println("-------------------------------");
        
        Supplier<Person> su = () -> new Person.Builder().build() ;
        System.out.println(su.get());
        
        Supplier<Person> su2 = () -> new Person.Builder().num("E101").City("苗栗").build() ;
        System.out.println(su2.get());
        
        System.out.println("-------------------------------");
        
        HashMap<String,String> map = new HashMap() ;
        map.put("A101","許") ;
        map.put("A201","王") ;
        map.put("C320","陳") ;
        map.put("C411","劉") ;
        map.put("D101","鄭") ;
        map.forEach((k , v) -> System.out.printf("%s\t%s%n",k,v));
        
    }
    
}
