/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class MainClass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ctest c = new ctest() ;
        c.dotest();
        System.out.println("------------------");
        
        //宣告匿名內部類別實作介面的抽象方法
        itest it = new itest() {
            @Override
            //實作抽象方法
            public void dotest() {
                System.out.println("內部類別.....");
            }    
        } ;
        it.dotest();
        System.out.println("------------------");
        //建立匿名內部類別實作指操作一次
        
        new itest() {
            @Override
            //實作抽象方法
            public void dotest() {
                System.out.println("內部類別.....");
            }    
        } .dotest();
        System.out.println("------------------");
        
        //lambda表達式實作抽象方法
        itest l = () -> System.out.println("lambda表達式呼叫dotest方法");
        l.dotest();
    }
    
}
