/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class RunnableDemo {
    public static void main(String[] args) {
        M2Thread M1 = new M2Thread("A") ;
        M2Thread M2 = new M2Thread("B") ;
        Thread T1 = new Thread(M1) ;
        Thread T2 = new Thread(M2) ;
        
        T1.start();
        T2.start();
        
        
    }
}


class M2Thread implements Runnable {
    
    
    private String name ;

    public M2Thread(String name) {
        this.name = name ;
    }
    
    
    @Override
    public void run() {
        Thread secodeThread = Thread.currentThread() ;
        
        for (int i = 1 ; i <= 3 ; i++) {
            System.out.printf("%s.%s 執行 %d 次%n",secodeThread,name,i);
        }
    }
    
}