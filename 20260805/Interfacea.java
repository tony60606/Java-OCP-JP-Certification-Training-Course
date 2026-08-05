/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public interface Interfacea {
    
    //抽象方法
    void test() ;
    
    //default 方法
    public default void dothis(int i) {
//        System.out.println("dothis方法 : " + i);
        //JAVA9.0 新增呼叫private方法
        dotest(i) ;
    }
    
    public default void dothat(int i) {
//        System.out.println("dothat方法 : " + i);
        dotest(i) ;
    }
    
    //JAVA9.0 private方法(內部呼叫)
    private void dotest(int i) {
        System.out.println("dotest : " + i);
    }
    
}
