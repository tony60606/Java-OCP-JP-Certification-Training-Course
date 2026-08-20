/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ttoon
 */
public class MainClass4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File file = new File("note1.txt") ;
        writeTest(file) ;
        System.out.println("----------------");
        readtest(file) ;
        
    }

    private static void writeTest(File file) {
       
        String temp = "ByteStream 位元處理 2026-08-17" ;
        
        try(FileOutputStream FO  = new FileOutputStream(file)) {
            FO.write(temp.getBytes());
            System.out.println("資料輸出完成");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static void readtest(File file) {
       
        try(FileInputStream FI = new FileInputStream(file)) {
            
            System.out.println("檔案大小 : " + FI.available() + "byte");
            
            int read ;
            while((read = FI.read()) != -1) {
                System.out.print((char)read);
            }
            System.out.println("檔案讀取完成");
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
