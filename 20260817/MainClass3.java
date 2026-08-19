/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
        
        //非執行續安全操作
        //ArrayList<String> list = new ArrayList(Arrays.asList("M1","M2","M3","M4","M5")) ;
        
        //執行續安全操作
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList(Arrays.asList("M1","M2","M3","M4","M5")) ;
        
        //建立執行續池來啟動新增人數的執行續
        ExecutorService E1 = Executors.newCachedThreadPool();
        
        for (int i = 1 ; i < 3 ; i ++) {
            E1.execute(new Add(list));
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        
       for (String s : list) {
           System.out.println("####" + s);
       }
        
       E1.shutdown();
        
    }
    
}


class Add implements Runnable {

    private List<String> list ;

    public Add(List list) {
        this.list = list;
    }

    @Override
    public void run() {
       
        for (int i = 1 ; i <= 3 ; i++) {
            list.add(String.format("A-%d-%s",i, Thread.currentThread().getName())) ;
            System.out.println("list = "  + list);
        }
    }
    
    

}