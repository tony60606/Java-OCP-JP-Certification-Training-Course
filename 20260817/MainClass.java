/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Random;

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
        
        //三個執行續共用一個物件
        Company C1 = new Company() ;
        //有三個銷售員
        Thread T1 = new Thread(C1,"銷售員A") ; //new Thread () 可帶入Runnable的物件，並設定該執行續名稱
        Thread T2 = new Thread(C1,"銷售員B") ; //new Thread () 可帶入Runnable的物件，並設定該執行續名稱
        Thread T3 = new Thread(C1,"銷售員C") ; //new Thread () 可帶入Runnable的物件，並設定該執行續名稱
        
        T1.start();
        T2.start();
        T3.start();
        
        try {
            T1.join();
            T2.join();
            T3.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        
        System.out.println("-----------------");
        System.out.println("金額 : " + C1.balance);
        
    }
    
}


class Company implements Runnable {

    int balance ;
    
    
    @Override
    public void run() {
        for (int i =1 ; i <= 3 ; i++) {
            
            
            //同步化區塊 : 多個執行續做的事情都一樣
            synchronized(this) {
                int temp = balance ;


                try {
                    Thread.sleep(new Random().nextInt(100));
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }

                temp += 100 ;
                balance = temp ;

                System.out.printf("%d.%s\sbalance : %d%n",i,Thread.currentThread().getName(),balance);
            
            }
            
        }
    }

    

}
