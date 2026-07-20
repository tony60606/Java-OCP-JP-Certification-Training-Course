/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
//實作介面 
public class Eagle implements Fly {

    private String name ;
    
    public Eagle(String name) {
        this.name = name ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void flying() {
        System.out.println("name：" + name);
        System.out.println("a：" + a);
        System.out.println("速度：" + Movespeed.flyspeed);
    } 
    
}
