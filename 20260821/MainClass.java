/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Stream;

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
            
            //建立檔案，並檢查檔案是否存在
            if (Files.exists(source)) {
                System.out.println(source.getFileName() + "檔案已存在");
            } else {
                Files.createFile(source) ;
                System.out.println(source.getFileName() + "檔案已建立");
            }
            
            //輸入資料，並檢查檔案是否為唯獨
            
            if (Files.isWritable(source)) {
                System.out.println("資料輸入中.....");
                List<String> list = List.of("JAVA","JDK21",LocalDateTime.now().toString(),"----------------------") ;
                Files.write(source, list, StandardOpenOption.APPEND) ;
                System.out.println("資料輸入完畢");
            } else {
                System.out.println(source.getFileName() + "資料無法寫入") ;
            }
            
            //讀取資料(搭配Stream)
            FileReader FR = new FileReader(source.toString()) ;
            BufferedReader BR = new BufferedReader(FR) ;
            BR.lines().forEach(System.out :: println);
            BR.close();
            FR.close();
            
            System.out.println("---------------------------");
            //讀取資料(File + Stream)
            Files.lines(source).forEach(System.out :: println);
            System.out.println("---------------------------");
            
            //檔案複製
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING) ;
            
            //檔案刪除
            Files.delete(target);
            
            //檔案搬移
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING) ;
            
            //走訪資料夾
            Path P1 = Paths.get(".") ;
            
            Stream<Path> S1 = Files.list(P1) ;
            S1.forEach(System.out :: println);
            System.out.println("-------------------------");
            Files.walk(P1).forEach(System.out :: println);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
    }
    
}
