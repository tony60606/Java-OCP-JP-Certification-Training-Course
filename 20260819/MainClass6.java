/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ttoon
 */
public class MainClass6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //定義檔案目錄物件
        Path source = Paths.get("C:/com/sample/java/help.txt") ;
        System.out.println("source : " + source);
        Path target = Paths.get("C:","com","sample","python","document.txt") ;
        System.out.println("target : " + target);
        
        System.out.println("----------------------");
        
        try{
            //建立資料夾
            Files.createDirectories(source.getParent()) ; //建立 c:/com/sample/java
            Files.createDirectories(target.getParent()) ; //建立 "c:","com","sample","python"
            System.out.println("資料夾建立完成");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
    }
    
}
