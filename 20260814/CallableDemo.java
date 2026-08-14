/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author student
 */
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException {
        
        
            ExecutorService L1 = Executors.newCachedThreadPool() ;
            Future<Set> f1 = L1.submit(new Lotto("f1")) ;
            Future<Set> f2 = L1.submit(new Lotto("f2")) ;
            Future<Set> f3 = L1.submit(new Lotto("f3")) ;
        try {
            System.out.println("f1 = " + f1.get());
            System.out.println("f2 = " + f2.get());
            System.out.println("f3 = " + f3.get());
        } catch (InterruptedException | ExecutionException ex) {
            System.out.println(ex);
        }
        
        L1.shutdown();
        System.out.println("已打烊");
    }
}

class Lotto implements Callable<Set> {
    
    private String name ;
    
    public Lotto(String name) {
        this.name = name ;
    }
    
    @Override
    public Set call() throws Exception {
        
        //建立Set集合
        Set<Integer> lotto = new TreeSet() ;
        Random random = new Random() ;
        
        while (lotto.size() < 6) {
            //讓執行續休眠
            Thread.sleep(random.nextInt(1234));
            int num = random.nextInt(49)+1 ;
            System.out.printf("%s name \t %02d \t %b%n",name,num,lotto.add(num));
        }
        return lotto ; 
    }

    
}
