/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ttoon
 */
public class MainClass5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // FileSystem：建立 Path 或 其他存取檔案系統的物件
        // Path：用來定義檔案或目錄
        // Files：用來操作檔案或目錄
        
        FileSystem fileSystem = FileSystems.getDefault();
        System.out.println("fileSystem：" + fileSystem);
        
        Path p1 = fileSystem.getPath("c:\\home\\oracle\\labs\\resources\\myfile.txt");
        System.out.println("p1：" + p1);
        
        Path p2 = fileSystem.getPath("c:", "home", "oracle", "labs", "resources", "myfile.txt");
        System.out.println("p2：" + p2);
        
        Path p3 = fileSystem.getPath("c:/home/oracle/labs/resources/myfile.txt");
        System.out.println("p3：" + p3);
        
        Path p4 = fileSystem.getPath("/home/oracle/labs/resources/myfile.txt");
        System.out.println("p4：" + p4);
        System.out.println("---------------------------");
        
        Path path1 = Paths.get("c:", "home", "oracle", "labs", "resources", "myfile.txt");
        System.out.println("path1 --> " + path1);                                   // c:\home\oracle\labs\resources\myfile.txt
        System.out.println("path1.getFileName()：" + path1.getFileName());          // myfile.txt
        System.out.println("path1.getParent()：" + path1.getParent());              // c:\home\oracle\labs\resources
        System.out.println("path1.isAbsolute()：" + path1.isAbsolute());            // true
        System.out.println("path1.toAbsolutePath()：" + path1.toAbsolutePath());    // c:\home\oracle\labs\resources\myfile.txt
        System.out.println("path1.getRoot()：" + path1.getRoot());                  // c:\
        System.out.println("path1.getName(3)：" + path1.getName(3));                // resources
        System.out.println("path1.subpath(1, 3)：" + path1.subpath(1, 3));          // oracle\labs
        System.out.println("path1.toUri()：" + path1.toUri());              // file:///c:/home/oracle/labs/resources/myfile.txt
        System.out.println("---------------------------");
        
        System.out.println("去除冗餘資訊...");
        Path path2 = Paths.get("c:/home/oracle/labs/../../resources/myfile.txt");
        System.out.println("path2：" + path2);
        Path newPath2 = path2.normalize();          // c:\home\resources\myfile.txt
        System.out.println("newPath2：" + newPath2);
        
        Path path3 = Paths.get("c:/home/oracle/labs/./../resources/myfile.txt");
        System.out.println("path3：" + path3);
        Path newPath3 = path3.normalize();          // c:\home\oracle\resources\myfile.txt
        System.out.println("newPath3：" + newPath3);
        System.out.println("---------------------------");
        
        System.out.println("路徑合併...");
        Path path4 = Paths.get("c:", "home", "oracle");
        System.out.println("path4：" + path4);
        
        // 合併 Path 物件
        System.out.println(path4.resolve(Paths.get("myfile.txt")));     // c:\home\oracle\myfile.txt
        // 合併用 String 表示的路徑
        System.out.println(path4.resolve("myfile.txt"));                // c:\home\oracle\myfile.txt
        System.out.println(path4.resolve("/myfile.txt"));               // c:\myfile.tx
        System.out.println(path4.resolve("resources/myfile.txt"));      // c:\home\oracle\resources\myfile.txt
        System.out.println(path4.resolve("/resources/myfile.txt"));     // c:\resources\myfile.txt
        System.out.println(path4.resolve("../../resources/myfile.txt"));// c:\home\oracle\..\..\resources\myfile.txt
        System.out.println("---------------------------");
        
        System.out.println("路徑切換...");
        Path path6 = Paths.get("c:/home/oracle/labs/resources");
        Path path7 = Paths.get("c:/java/labs");
        System.out.println(path6.relativize(path7));  // ..\..\..\..\java\labs
    }
} 
