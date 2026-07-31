/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author student
 */
public class MapDemo {
    public static void main(String[] args) {
        
        HashMap<String,String> map = new HashMap();
        map.put("A02","小明" ) ;
        map.put("X01","小剛" ) ;
        map.put("B05","Amily" ) ;
        map.put("C04","曉霞" ) ;
        map.put("A03","John" ) ;
        map.put("A09","Tony" ) ;
        map.put("B11","Brown" ) ;
        
        System.out.println("map = " + map);
        
        //加入相同key資料
        map.put("A03","Andy") ;
        System.out.println("map = " + map);
        
        //取值：get()
        System.out.println("A03 = " + map.get("A03"));
        System.out.println("A04 = " + map.get("A04"));
        System.out.println("-------------------------");
        
        Set<String> key = map.keySet();
        System.out.println(key);
        
        for (var a : key) {
            System.out.println("ID名稱：" + a + "，姓名：" + map.get(a));
        }
        
        //values()
        System.out.println("map = " + map.values());
        
    }
}
