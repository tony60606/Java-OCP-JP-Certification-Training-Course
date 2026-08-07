/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
@FunctionalInterface
public interface msg {
    
    //設計一個抽象方法，該方法會回傳一個print型別的物件
    print agg(String a) ;
    
    
}
//------------------

/*
 msg中的抽象方法被實作寫法

    //一般實作寫法
    public msg agg(String a) {
    
    return new print(a) ;

    }

    //lambda

    s -> new print(s) ;

    //lambda 只呼叫一個建構子

    print :: new

*/

//-------------------
//自訂類別

class print {
    
    private String Msg ;
    
    public print(String Msg) {
        this.Msg = Msg ;
        System.out.println("print物件已建立" + this.Msg);
    }
    
    public void show() {
        System.out.println("show的方法" + Msg.toUpperCase());
    }


}