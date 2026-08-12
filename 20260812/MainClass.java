/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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
        
        
        Stream<String> st6 = Stream.of("apple", "banana", "cat", "dog", "elephant", "frog", "grape", "house").peek(s -> System.out.println("1." + s)).filter(s -> s.length() >3).peek(s -> System.out.println("2." + s)).map(s -> s.toUpperCase()).peek(s -> System.out.println("3." + s)) ;
        
        //測試不同終端操作
        //st6.forEach(s -> System.out.println("4." + s));
        //long count = st6.count() ;
        //System.out.println("完整跑完的資料筆數 : " + count);
        //List<String> a1 = st6.collect(Collectors.toList()) ;
        //System.out.println("a1 = " + a1);
        //String a2 = st6.collect(Collectors.joining(" -> ")) ;
        //System.out.println("a2 = " + a2);
        //a1.forEach(s -> System.out.print(s + "->"));
        //System.out.println("\n");
        
        //排序
        List<String> a3 = Arrays.asList("grape", "house", "banana", "dog", "elephant", "apple", "cat", "frog") ;
        System.out.println("排序前 : " + a3);
        System.out.println("-----------------");
        System.out.println("自然排序 : ");
        a3.stream().sorted().forEach(s -> System.out.printf("%s | ",s));
        System.out.println("\n-----------------");
        System.out.println("自訂排序 : ");
        a3.stream().sorted((s1,s2) -> s1.compareTo(s2)*-1).forEach(s -> System.out.printf("%s | ",s));
        System.out.println("\n-----------------");
        System.out.println("排序後 : " + a3);
        System.out.println("-------------------------");
        List<MainClass2> book = List.of(new MainClass2("哈利波特", 399),
                                        new MainClass2("原子習慣", 350),
                                        new MainClass2("被討厭的勇氣", 300),
                                        new MainClass2("小王子", 250),
                                        new MainClass2("解憂雜貨店", 350),
                                        new MainClass2("嫌疑犯X的獻身", 399)
                                        ) ;
        System.out.println(book);
        System.out.println("多重排序 : ");
        System.out.println("定義多重排序規則");
        Comparator<MainClass2> com = Comparator.comparing(MainClass2 :: getPrice)
                                     .thenComparing(MainClass2 :: getName)
                                     .reversed();
        System.out.println("排序");
        book.stream().sorted(com).forEach(System.out :: println);
        
        System.out.println("-------------------------");
        List<Integer> a = List.of(11,12,13 ) ;
        List<Integer> b = List.of(101,102,103 ) ;
        List<Integer> c = List.of(55,66,77 ) ;
        List<Integer> d = List.of(88,99,100) ;
        List<Integer> e = List.of(3,5,7) ;
        
        List<List<Integer>> intall = List.of(a,b,c,d) ;
        System.out.println("intall = " + intall);
        
        System.out.println("方法一 : ");
        List<Integer> L1 = new ArrayList() ;
        for (List<Integer> A : intall) {
            for (int s : A ){
                L1.add(s) ;
            }
        }
        System.out.println("L1 = " + L1);
        
        System.out.println("方法二 : ");
        System.out.println("攤平");
        List<Integer> L2 = intall.stream().peek(s -> System.out.println(s)).flatMap(s -> s.stream()).peek(s -> System.out.println(s)).collect(Collectors.toList());
        System.out.println("L2 = " + L2);
        System.out.println("-------------------------");
        
        List<Integer> num = List.of(42, 8, 25, 77, 42, 14, 8, 91, 25, 63, 8, 42, 50, 25, 11, 88, 14, 25, 42, 99) ;
        System.out.println("num = " + num);
        List<Integer> even = num.stream().filter(s -> s % 2 == 0).collect(Collectors.toList()) ;
        System.out.println("even = " + even);
        Set<Integer> odd = num.stream().filter(s -> s > 50).filter(s -> s % 2 != 0).collect(Collectors.toSet()) ;
        System.out.println("odd = " + odd);
        Map<Integer , Long> same = num.stream().filter(s -> s % 2 == 0).collect(Collectors.groupingBy(s -> s , Collectors.counting())) ;
        System.out.println("same = " + same);
        
        System.out.println("各數值的平方");
        Map<String , Integer> Dd = Stream.of(10,12,25,38,6,4,15).collect(Collectors.toMap(s -> String.valueOf(s), s -> s * s)) ;
        System.out.println("Dd = " + Dd);
        System.out.println(Dd.get("4"));
        
        Map<String , Integer> Ee = Stream.of(10,12,25,38,6,4,15).collect(Collectors.toMap(s -> String.valueOf(s), s -> s * s,(o , n) -> o , TreeMap :: new )) ;
        System.out.println("Ee = " + Ee);
    }
    
}
