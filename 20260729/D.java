/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample.packageb;

import com.sample.packagea.A;

/**
 *
 * @author ttoon
 */
public class D {
    
    public void dotest(){
        System.out.println("class D ：");
        A a = new A() ;
        System.out.println("a.z：" + a.z);
        a.dotest();
    }
    
    
}
