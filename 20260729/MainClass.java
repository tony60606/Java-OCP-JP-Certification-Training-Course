/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import com.sample.packagea.A;
import com.sample.packagea.B;
import com.sample.packageb.C;
import com.sample.packageb.D;

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
        A a = new A() ;
        a.dotest();
        System.out.println("-----------");
        B b = new B() ;
        b.dotest();
        System.out.println("-----------");
        C c = new C() ;
        c.dotest();
        System.out.println("-----------");
        D d = new D() ;
        d.dotest();
        System.out.println("-----------");
    }
    
}
