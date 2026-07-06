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
        Book book1 = new Book();
        book1.getvalue("S001", "JAVA", 200);
        book1.getcost(150);
        book1.booking();
        System.out.println("------------");
        System.out.println("取得新價格");
        book1.getnewprice(-1);
        book1.booking();
        System.out.println("------------");
        //用有參數建構子(初始化)建立物件
        Book book3 = new Book("S002","Python",300) ;
        book3.getcost(350);
        book3.getnewprice(1.4);
        book3.booking();
    }
    
}
