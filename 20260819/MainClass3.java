/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

/**
 *
 * @author ttoon
 */
public class MainClass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //由主控台取得輸入資料
        //等於 Scanner Scan = new Scanner(System.in)
        InputStreamReader ISR = new InputStreamReader(System.in) ;
        BufferedReader BR = new BufferedReader(ISR) ;
        
        File file = new File("log.txt") ;
        
        String[] log = new String[3] ;
        
        //將事件紀錄寫入log檔案
        
        try(FileWriter FW = new FileWriter(file,true); //第二個參數設定為true，代表使用附加方式新增資料
            BufferedWriter BW = new BufferedWriter(FW)) {
            
            //接收鍵盤輸入資料
            System.out.print("請輸入ID : ");
            log[0] = BR.readLine() ; //等同於 Scan.nextLine() ;
            System.out.print("請輸入密碼 : ");
            log[1] = BR.readLine() ;
            log[2] = LocalDateTime.now().toString();
            
            
            //使用迴圈將陣列中資料寫入log.txt
            for (String s : log) {
                BW.write(s);
                BW.newLine(); //換行
            }
            
            BW.newLine();
            BW.write("---------------------------");
            BW.newLine();
            
            System.out.println("事件紀錄完成");
            
            
        }   catch (IOException ex) {
            System.out.println(ex);
        }
        
        System.out.println("----------------------------");
        
        
        Readlog(file) ;
        
        
    }

    private static void Readlog(File file) {
        
        try(FileReader FR = new FileReader(file);
            BufferedReader BR = new BufferedReader(FR)){
            String line ;
            while ((line = BR.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
        
        
}
