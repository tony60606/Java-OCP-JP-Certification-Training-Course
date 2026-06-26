/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.samole;

/**
 *
 * @author ttoon
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book1 = new Book() ;//建立物件：類別型別 變數名稱 = new 建構子() ;
        book1.name = "神鵰俠侶" ;//操作物件：物件變數名稱.物件成員名稱
        book1.price = 1000 ;
        book1.display();
        System.out.println("Book1記憶體位址"+System.identityHashCode(book1));
        System.out.println("------------------------------------");
        Book book2 = new Book() ;//建立物件：類別型別 變數名稱 = new 建構子() ;
        book2.name = "天龍八部" ;//操作物件：物件變數名稱.物件成員名稱
        book2.price = 1500 ;
        book2.display();
        System.out.println("Book2記憶體位址"+System.identityHashCode(book2));
        System.out.println("------------------------------------");
        
        //物件共用
        Book book3 = book2 ;
        System.out.println("變更後");
        book3.price =2000 ;
        //兩個記憶體位只會相同
        System.out.println("Book2記憶體位址"+System.identityHashCode(book2));
        System.out.println("Book3記憶體位址"+System.identityHashCode(book3));
        book2.display(); //原屬性的的值會被新的值取代
        book3.display();
        System.out.println("------------------------------------");
        book1 = book2 ;
        System.out.println("Book1記憶體位址"+System.identityHashCode(book1));
        System.out.println("Book2記憶體位址"+System.identityHashCode(book2));
        book1.display();
        book2.display();
        System.out.println("------------------------------------");
        //將null(參考型別預設值--代表空值or無)指定給book2
        book2 = null ; //book2沒指向任何Book建立的物件
        System.out.println("Book2記憶體位址"+System.identityHashCode(book2));
//        book2.display();//執行期錯誤NullPointerException
        
    }
    
}
