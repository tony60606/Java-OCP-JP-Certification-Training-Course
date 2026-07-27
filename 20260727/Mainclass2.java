/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sanple;

import java.util.HashSet;

/**
 *
 * @author student
 */
public class Mainclass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book("鹿鼎記",'L',500) ;
        System.out.println("book1 = " + book1);
        System.out.println("book1 = " + book1.toString());
        System.out.println("---------------------------");
        Book book2 = new Book("神鵰俠侶",'S',700) ;
        System.out.println("book2 = " + book2);
        Book book3 = new Book("長城訣",'T',750) ;
        System.out.println("book3 = " + book3);
        Book book4 = new Book("長城訣",'T',750) ;
        System.out.println("book4 = " + book4);
        Book book5 = book4 ;
        System.out.println("book5 = " + book5);
        System.out.println("---------------------------");
        System.out.println("book1記憶體位址：" + System.identityHashCode(book1));
        System.out.println("book2記憶體位址：" + System.identityHashCode(book2));
        System.out.println("book3記憶體位址：" + System.identityHashCode(book3));
        System.out.println("book4記憶體位址：" + System.identityHashCode(book4));
        System.out.println("book5記憶體位址：" + System.identityHashCode(book5));
        System.out.println("---------------------------");
        System.out.println("book1 == book2：" + (book1 == book2));
        System.out.println("book2 == book3：" + (book2 == book3));
        System.out.println("book3 == book4：" + (book3 == book4));
        System.out.println("book4 == book5：" + (book4 == book5));
        System.out.println("book5 == book1：" + (book5 == book1));
        System.out.println("---------------------------");
        System.out.println("物件比較：" + book1.equals(book2));
        System.out.println("物件比較：" + book2.equals(book3));
        System.out.println("物件比較：" + book3.equals(book4));
        System.out.println("物件比較：" + book4.equals(book5));
        System.out.println("物件比較：" + book5.equals(book1));
        System.out.println("---------------------------");
        //查詢物件hashcode
        System.out.println("book1 Hashcode：" + book1.hashCode());
        System.out.println("book2 Hashcode："+ book2.hashCode());
        System.out.println("book3 Hashcode：" + book3.hashCode());
        System.out.println("book4 Hashcode：" + book4.hashCode());
        System.out.println("book5 Hashcode：" + book5.hashCode());
        //建立接收不重複HASHCODE的集合
        HashSet<Book> set = new HashSet() ;
        System.out.println("加入book1：" + set.add(book1));
        System.out.println("加入book2：" + set.add(book2));
        System.out.println("加入book3：" + set.add(book3));
        System.out.println("加入book4：" + set.add(book4));
        System.out.println("加入book5：" + set.add(book5));
        //查看集合資料
        System.out.println(set);
        
        
    }
    
}
