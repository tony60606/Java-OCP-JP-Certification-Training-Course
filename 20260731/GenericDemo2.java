/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class GenericDemo2 {
    public static void main(String[] args) {
        //建立物件未指定型別，T的型別為Object
        Any c1 = new Any() ;
        c1.add(123);
        System.out.println((int)c1.get()*2);
        c1.add("JAVA");
        System.out.println(((String)c1.get()).toLowerCase());
        c1.add('A');
        System.out.println(c1.get());
        
        Any<Integer> c3 = new Any<>() ; //JAVA7.0以前
        c3.add(123);
        System.out.println(c3.get()*2);
        
        Any<String> c2 = new Any<>() ; //JAVA7.0以後，new Any<>的<>內型別可省略
        c2.add("JAVA");
        System.out.println(c2.get().toUpperCase());
        c2.add("Python");
        System.out.println(c2.get().toUpperCase());
        c2.add("C++");
        System.out.println(c2.get().toUpperCase());
        
        Any<Double> c4 = new Any() ; //JAVA7.0以後，new Any<>的<>可省略
        c4.add(1.23);
        System.out.println(c4.get()*2);
        
        
        
        
    }
}//主方法結束

//泛行類別
class Any<T> {
    
    private T t ;
    
    public void add(T t){
        this.t = t ;
    }
    
    public T get(){
        return t ;
    }




}
