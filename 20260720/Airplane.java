/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public class Airplane implements Fly {
    
    private String name ;
    private int seat ;

    public Airplane(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
    
    
    
    @Override
    public void flying() {
        System.out.println("飛機：" + name);
        System.out.println("可搭乘人數：" + seat + "人");
    }
    
}
