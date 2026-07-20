/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Subclass sub = new Subclass(3,8) ;
//        System.out.println("------------");
//        sub.display();
        
    }
    
}//MainClass 結束

final class Superclass { //設定final：該class不能被繼承
    public final void display(){ //設定final ：該方法不能override
        System.out.println("父類別方法....");
    }
    
}//父類別結束

//class Subclass extends Superclass {
//    
//    //一般類別屬性初始化
//    int a ; //預設值
//    int b = 10 ; //明確指定
//    int c ; //建構子
//    
//    final int d ;
//    final int e = 5 ;
//    
////    public Subclass(int c){
////        System.out.printf("建構子呼叫時：《a = %d , b = %d , c = %d》%n",this.a,this.b,this.c);
////        this.c = c ;
////        System.out.printf("建構子呼叫時：《a = %d , b = %d , c = %d》%n",this.a,this.b,this.c);
////    }
//    
//    public Subclass(int d , int e){
//        this.d = d ;
//        System.out.println("d = " + this.d);
//        System.out.println("e = " + this.e);
//    }
//
//    @Override
//    public void display() {
//        System.out.println("子類別方法...."); 
//        
//        //方法內宣告final常數 => 方法內可使用
//        final int F = 100 ;
//        System.out.println("F = " + F); 
//    }
//    
//    
//    
//}//子類別結束