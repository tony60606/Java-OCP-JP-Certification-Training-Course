/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

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
        //要呼叫物件成員需先建立物件
        
        //先觀察物件中屬性的值
        Book book1 = new Book() ;
        //物件剛建立
        //呼叫物件成員方法
        System.out.println("----物件剛建立----");
        book1.Bookstore();
        System.out.println("----------------");
        
        //物件建立後變更屬性值
        System.out.println("----物件變更----");
        book1.Id = "S001" ;
        book1.name = "會計學" ;
        book1.price = 1500 ;
        //呼叫公開操作介面(方法)指定cost的值
        book1.setcost(2000);
        book1.Bookstore();
        System.out.println("----------------");
        
        //呼叫有回傳值的方法，呼叫端要有後續接收資料的動作
        //測試：沒有後續回傳值的動作
        book1.getnewprice(1.5) ;
        System.out.println("----------------");
        //方法一：宣告新變數接收回傳資料
        double newprice = book1.getnewprice(1.5) ;
        System.out.println("新售價" + newprice);
        System.out.println("----------------");
        //方法二：直接秀出結果
        System.out.println("新售價" + book1.getnewprice(2.5));
        System.out.println("----------------");
        book1.price = book1.getnewprice(3.2) ;
        book1.Bookstore();
        System.out.println("----------------");
        
        Book book2 = new Book() ;
        Book book3 = new Book() ;
        Book book4 = new Book() ;
        book2.seting("S002", "Python", 2500);
        book2.setcost(1300);
        book3.seting("S003", "統計學", 1000);
        book3.setcost(750);
        book4.seting("S004", "AutoCAD", 1800);
        book4.setcost(1400);
        book2.Bookstore();
        book3.Bookstore();
        book4.Bookstore();
        
        
    }
    
    
    
}
