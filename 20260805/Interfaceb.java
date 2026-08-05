/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */
public interface Interfaceb {
    
    public default void dothis(int i) {
        System.out.println("Interfacebdothis方法 : " + i);
    }
    
    public default void dothat(int i) {
        System.out.println("Interfacebdothat方法 : " + i);
    }
    
}
