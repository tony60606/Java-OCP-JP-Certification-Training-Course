/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MainClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList test1 = new ArrayList<String>() ; //參數是Object型別
        List test2 = test1 ;//參數是Object型別
        
        var test3 = new ArrayList() ;//參數是Object型別
        var test4 = test3 ;//參數是Object型別
        
        var test5 = new ArrayList<String>() ; //參數是String型別
        var test6 = test5 ;
        
        List test7 = test5 ;
        var test8 = (List)test5 ;
        //test7.test8都是List型態，參數都是Object型別
        
        
    }
    
}
