/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class ThreadDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //建立目前執行序物件
        Thread MainThread = Thread.currentThread();
        System.out.println("執行續物件 : " + MainThread);
        System.out.println("執行續名稱 : " + MainThread.getName());
        System.out.println("執行續ID : " + MainThread.getId());
        System.out.println("--------------------");
        M1Thread M1 = new M1Thread("D") ;
        M1Thread M2 = new M1Thread("E") ;
        //M1.run();
        //M2.run();
        M1.start();
        M2.start();
    }
    
}

class M1Thread extends Thread {

    private String name ;

    public M1Thread(String name) {
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
