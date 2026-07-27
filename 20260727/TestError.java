/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class TestError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] narray = new int[5] ;
        //narray[5] = 14 ; //Unchecked：ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        
        String str = null;
        //str.toLowerCase() ;//Unchecked：NullPointerException: Cannot invoke "String.toLowerCase()" because "str" is null
        System.out.println(str);
        
        //測試Unchecked：記憶體不足
//        ArrayList<String> list = new ArrayList() ;
//        while(true) {
//            list.add("測試Unchecked：記憶體不足") ;
//            if(list.size() % 1000000 == 0) {
//                System.out.println("資料比數：" + list.size() / 1000000 + "百萬筆"); //Unchecked：OutOfMemoryError: Java heap space
//            }
//        }
        
    }
    
}
