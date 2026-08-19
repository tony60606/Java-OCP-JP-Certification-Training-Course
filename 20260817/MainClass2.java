/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author ttoon
 */
public class MainClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ExecutorService E1 = Executors.newCachedThreadPool();
        
        for (int i = 1 ; i <= 20 ; i++) {
            E1.execute(new test());
        }
        
        E1.shutdown();
    }
    
}


//運動員測試
class test implements Runnable {

    private static int i = 0 ; //報到序號
    private static AtomicInteger ai = new AtomicInteger(1) ; //號碼牌，設定起始值為1
    private static CyclicBarrier cy = new CyclicBarrier(5) ; //5 代表5個執行續就定位再繼續執行
    
    @Override
    public void run() {
        
        //號碼牌
        int num = ai.getAndIncrement() ;
        
        
        try{
            Thread.sleep(new Random().nextInt(500));
            System.out.printf("報到序號 : %02d\t%-20s選手 %02d號 就定位\t%n",++i,Thread.currentThread().getName(),num);
            cy.await() ;
        } catch (InterruptedException | BrokenBarrierException ex) {
            System.out.println(ex);
        } 
        
        System.out.printf("%-20s選手 %02d號 起跑%n",Thread.currentThread().getName(),num);
           
        
    }
    
}
