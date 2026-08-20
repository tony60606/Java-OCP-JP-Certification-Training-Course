/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ttoon
 */
public class MainClass1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("note1.txt") ;
        
        write(file) ;
        reader(file) ;
        
    }

    private static void write(File file) {
        String temp = "Character Streams 字元處理 2026-08-19" ;
        
        try (FileWriter FW = new FileWriter(file)) {
            FW.write(temp);
            System.out.println("檔案輸出完成");
        }  catch (IOException ex) {
            System.out.println(ex);
        }
    }

    private static void reader(File file) {
        
        try (FileReader FR = new FileReader(file)){
            int read ;
            while((read = FR.read()) != -1) {
                
                System.out.print((char)read);
            }
            System.out.println("\n資料讀取完成");
        } catch (IOException ex) {
            System.out.println(ex);
        }    
    
    }
}
