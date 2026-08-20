/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ttoon
 */
public class Mainclass7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student A1 = new Student("Tony") ;
        A1.colScore(55,80,95,66,78,90);
        System.out.println(A1);
        
        
        //序列化
        try(FileOutputStream FOS = new FileOutputStream("Stu.stu");
            ObjectOutputStream OOS = new ObjectOutputStream(FOS)) {
            OOS.writeObject(A1);
            System.out.println("儲存完成!");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        System.out.println("===================");
        
        //反序列化
        try(FileInputStream FIS = new FileInputStream("Stu.stu");
            ObjectInputStream OIS = new ObjectInputStream(FIS)) {
            System.out.println("檔案大小 : " + OIS.available() + "Byte");
            
            Student s = (Student)OIS.readObject() ;
            
            System.out.println("姓名 : " + s.getName());
            System.out.println("總分 : " + s.getSum());
            System.out.println("平均 : " + s.getAverage());
            System.out.println("日期 : " + s.getDatetime());
            
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        
        
    }
    
}
