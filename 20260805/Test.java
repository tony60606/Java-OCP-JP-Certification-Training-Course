/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class Test implements Interfacea, Interfaceb {


    @Override
    public void test() {
        System.out.println("實作抽象方法");
    }

    //可以直接使用介面提供的default方法
    //如有需要也可改寫
    @Override
    public void dothat(int i) {
        Interfacea.super.dothat(i);
        for (var a = i ; a < 100 ; a+=10){
            System.out.println("a = " + a);
        }
        System.out.println("------------");
        Interfaceb.super.dothat(i);
    }

    @Override
    public void dothis(int i) {
        //再明確指定要呼叫哪一個介面中的default方法
        Interfacea.super.dothis(i); 
        System.out.println("---------");
        Interfaceb.super.dothis(i); 
        
    }

   
    
}
