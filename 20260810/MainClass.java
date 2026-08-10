/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

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
        
        //建立stream
        //ArrayList方式=Arrays.asList -> List -> stream
        Stream<Integer> st1 = Arrays.asList(1,3,5,7,9).stream() ;
        
        st1.forEach(s -> System.out.printf("%d | ",s)); //執行後,st1已無資料
        System.out.println("\n-------------------------------");
        st1=Arrays.asList(1,3,5,7,9).stream() ;
        st1.forEach(s -> System.out.printf("%d | ",s)); 
        System.out.println("\n-------------------------------");
        st1=Arrays.asList(1,3,5,7,9).stream() ;
        st1.forEach(System.out :: print);
        System.out.println("\n-------------------------------");
        
        //stream.of
        Stream<Integer> st2 = Stream.of(2,4,6,8,10,12,14) ;
        long count1 = st2.count() ;
        System.out.println("st2個數 : " + count1);
        
        //Arrays.stream()
        Stream<Double> st3 = Arrays.stream(new Double[]{1.1,2.22,3.15,0.85}) ;
        System.out.println(st3.mapToDouble(d -> d).sum());
        System.out.println("----------------");
        DoubleStream st4 = Arrays.stream(new double[]{1.1,2.22,3.15,0.85}) ;
        System.out.println(st4.sum()) ;
        System.out.println("----------------");
        
        Stream<String> st5 = Arrays.stream(new String[]{"a1","b23","c456"}) ;
        
        //觀察終端操作會傳的資料型別
        OptionalDouble opt1 = st5.map(s -> s.substring(1)).mapToInt(s -> Integer.parseInt(s)).average();
        System.out.println(opt1);
        double avg = opt1.getAsDouble() ;
        System.out.println("avg = " + avg);
        
        double avg2 = Stream.of("a1","b23","c456").map(s -> s.substring(1)).mapToInt(s -> Integer.parseInt(s)).average().getAsDouble() ;
        System.out.println("avg2 = " + avg2);
        
        
        
    }
    
}
