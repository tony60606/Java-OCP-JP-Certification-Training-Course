/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample.packagea;

/**
 *
 * @author ttoon
 */
public class B {
    
    public void dotest(){
        System.out.println("class B ：");
        A a = new A() ;
        System.out.println("a.x：" + a.x);
        System.out.println("a.y：" + a.y);
        System.out.println("a.z：" + a.z);
        a.dotest();
    }
}
