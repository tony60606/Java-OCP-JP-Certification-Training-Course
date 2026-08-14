/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author student
 */
public class ExecutorServiceDemo {
    public static void main(String[] args) {
        
        //處裡固定數量的執行續池
        ExecutorService Ex = Executors.newFixedThreadPool(5) ; //模擬4個窗口
        
        //有15位洽公民眾
        for (int i = 1 ; i <= 15 ; i++){
            //建立、啟動執行續處理
            Ex.execute(new M3Thread(i));
        }
        
        Ex.shutdown();
        
        
    }
}

class M3Thread implements Runnable {
    
    private int num ;

    public M3Thread(int num) {
        this.num = num ;
    }

    @Override
    public void run() {
        
            String name = Thread.currentThread().getName() ;
            //System.out.println("name = " + name);
            
            
            //從執行續名稱取出最後一個字
            String currentNum = name.substring(name.length()-1) ;
            //System.out.println("處理櫃台 : " + currentNum);
            
            //模擬辦理業務時間
            int time = new Random().nextInt(5000) ; //隨機產生0~4999的任意整數，配合Thread.sleep(毫秒)讓執行續進入休眠，每1000為1秒
            
            //叫號
            System.out.printf("%02d 號來賓，請到%s號櫃台辦理\t%d%n",num,currentNum,time);
            
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        
    }
}