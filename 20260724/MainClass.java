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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //未指定型別,加入集合的元素皆會轉為Object型別
        //ArrayList加入的元素都是物件(都是參考型別資料)
        //建立ArrayList
        ArrayList obj = new ArrayList();
        
        //加入資料
        obj.add(123) ;
        obj.add(new Integer(456)) ; //不建議使用
        obj.add("JAVA") ;
        obj.add(true) ;
        obj.add(3.14) ;
        System.out.println("obj = " + obj);    
        
        obj.add(3, "Obj");
        obj.add(2, "JAVA");
        System.out.println("obj = " + obj);
        
        System.out.println("obj[4] = " + obj.get(4));
        System.out.println("obj數量：" + obj.size());
        
        System.out.println("-----------");
        
        for (var i = 0 ; i < obj.size() ; i++) {
            System.out.println("obj集合位置[" + i + "]資料是：" + obj.get(i));
            System.out.println("----------------");
        }
        
        var temp = obj.get(2) ;
        System.out.println("temp = " + temp);
        System.out.println(((String)temp).toLowerCase());
        var temp2 = obj.get(1) ;
        System.out.println("temp2 = " + temp2);
        System.out.println((int)temp2 * 5);
        System.out.println("-----------");
        
        ArrayList<String> obj2 = new ArrayList() ;
        obj2.add("Marshmallow") ;
        obj2.add("Marshmallow") ;
        obj2.add("Lollipop") ;
        obj2.add("Gummy") ;
        obj2.add("Jellybean") ;
        obj2.add("Lollipop") ;
        obj2.add(new String(new char[] {'G','u','m','m','y'})) ;
        System.out.println("obj2 = " + obj2);
        System.out.println("------------------------");
        System.out.println(obj2.get(3).toLowerCase());
        System.out.println("集合中po的位置：" + obj2.indexOf("Gummy"));//集合中找不到資料會回傳 -1
        System.out.println("------------------------");
        obj2.set(4, "Toffee") ;
        System.out.println("obj2 = " + obj2);
        System.out.println("------------------------");
        
        if (obj2.indexOf("Lollipop") != -1) { //先判斷該集合中是否有""字串
            obj2.set(obj2.indexOf("Lollipop"), obj2.get(obj2.indexOf("Lollipop")).toUpperCase()); //第一個出現的字串改大寫
        }
        System.out.println("obj2 = " + obj2);
        
        
        obj2.remove(3) ;
        System.out.println(obj2.remove("Gummy"));
        System.out.println("obj2 = " + obj2);
        System.out.println("------------------------");
        
        System.out.println("------------------------");
        
        for (var O : obj2) {
            System.out.printf("%s | ",O);
        }
        
        System.out.println("\n------------------------");
        //clear 清空集合
        obj2.clear();
        System.out.println("obj2是否是空集合：" + obj2.isEmpty());
        System.out.println("obj2：" + obj2);
    }
    
}
