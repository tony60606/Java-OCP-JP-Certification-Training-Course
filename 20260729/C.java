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
public class C extends A{

    @Override
    public void dotest() {
        System.out.println("class C："); 
        System.out.println("a.y" + y);
        System.out.println("a.z" + z);
    }
    //因繼承不同package的class A ，可以改寫方法
    
    
}
