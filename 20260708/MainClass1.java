/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class MainClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 1 ;
        int b = a ;
        System.out.printf("a的值為%d，b的值為%d%n",a,b);
        
        //變更a的值
        
        a = a+1 ;
        System.out.printf("a的值為%d，b的值為%d%n",a,b);
        
        
        //呼叫dotest方法，將區域變數值送過去
        dotest(a) ;
        System.out.println("a(1) = " + a);
        System.out.println("-----------------");
        //建立book物件
        Book1 book1 = new Book1("JAVA",500);
        System.out.println(book1.getvalue());
        System.out.println("-----------------");
        Book1 book2 = new Book1("Python",600);
        System.out.println("(1)：" + book2.getvalue());
        System.out.println("-----------------");
        dotest(book2) ;
        System.out.println("-----------------");
        System.out.println("(4)：" + book2.getvalue());
        System.out.println("-----------------");
        //建立 String 物件
        String str = "Microsoft" ;
        System.out.println("(1)str：" + str);
        dotest(str) ;
        System.out.println("(4)str：" + str);
        System.out.println("-----------------");
        
        //方法多載呼叫
        System.out.println("1+2=" + Calculator.sum(1, 2));
        System.out.println("1.22+22="+Calculator.sum(1.22, 22));
        
        //方法使用可變動參數
        avg(11,22);
        avg(22,33,44);
        avg(44,55,66,77);
        avg(404,505,606,707,808);
        
        
    }//main 主方法結束
    
    private static void avg(int... num){
        double sum = 0 ;
        for (int i : num){
            sum = sum + i ;
        }
        System.out.println("陣列總和：" + sum);
        System.out.println("陣列平均：" + (sum / num.length));
        System.out.println("----------------------------");
    }
   
    
    
    //類別成員方法，主方法可以直接呼叫
    private static void dotest(int a){
        System.out.println("a(2) = " + a);
        a = a+1 ;
        System.out.println("a(3) = " + a);
    }
    
    private static void dotest(Book1 book) {
        System.out.println("(2) ：" + book.getvalue()) ;
        System.out.println("-----------------");
        book.price = 700 ;
        System.out.println("(3) ：" + book.getvalue()) ;
        
    }
    
    private static void dotest(String b){
        System.out.println("(2)str：" + b);   
        b = b.toUpperCase() ;
        System.out.println("(3)str：" + b);   
    }


    
}
