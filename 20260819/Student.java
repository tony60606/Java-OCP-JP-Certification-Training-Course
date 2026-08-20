/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author ttoon
 */
public class Student implements Serializable {
    
    //定義物件保存版本編號
    private static long seriaVersionUID = 1L ;
    
    private String name ;
    private int sum ;
    private double average ;
    private transient LocalDateTime datetime = LocalDateTime.now() ; //不參與序列化

    public Student(String name) {
        this.name = name;
    }
    
    public void colScore(int ...score) {
        
        if (score.length > 0) {
            for(int i : score) {
                sum += i ;
            }
            average = (double) sum / score.length ;
        } else {
            sum = 0 ;
            average = 0.0 ;
        }
        
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage() {
        return average;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", sum=" + sum + ", average=" + average + ", datetime=" + datetime + '}';
    }
    
    
}
