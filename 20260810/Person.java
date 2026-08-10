/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Person {
    
    
    //屬性
    private String num ;
    private String name ;
    private int age ;
    private String Email ;
    private String City ;
    
    
    //宣告 static 內部類別收集資料
    public static class Builder {
        //內部類別屬性對應外部類別的屬性並指定初始值
        private String num = "" ;
        private String name = "" ;
        private int age  = 0;
        private String Email  = "";
        private String City  = "台北";
        
        //內部類別不寫建構子初始化資料
        //建立接收資料方法，每個方法都要回傳內部類別的資料(return this)
        public Person.Builder num(String num) {
            //this 內部類別的屬性
            this.num = num ;
            return this ;
        }
        
        public Person.Builder name(String name){
            this.name = name ;
            return this ;
        }
                
        public Person.Builder age(int age) {
            this.age = age ;
            return this ;
        }
                
        public Person.Builder Email(String Email) {
            this.Email = Email ;
            return this ;
        }
                
        public Person.Builder City(String City) {
            this.City = City ;
            return this ;
        }
        
        //接收資料後呼叫外部類別Person的private建構子建立外部類別物件並回傳
        public Person build() {
            return new Person(this) ;
        }
        
    }//內部類別結束
    
    //Person建構子要宣告為private 不讓其他程式直接建立Person物件
    private Person(Builder builder) {
        //將內部類別收集的資料指定給外部類別，用來初始化Person物件
        //this代表Person物件
        this.num = builder.num ;
        this.name = builder.name ;
        this.age = builder.age ;
        this.Email = builder.Email ;
        this.City = builder.City ;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    @Override
    public String toString() {
        return "ID：" + num + ",name = " + name + ",age = " + age + ",Email = " + Email + ",City = " + City ;        
    }
    
    //---------------------------------------------------------------------
    // 建立 Person 集合
    public static List<com.sample.Person> createList(){
        List<com.sample.Person> list = new ArrayList();
        list.add( new com.sample.Person.Builder()
                              .num("A101")
                              .name("Bob")
                              .age(21)
                              .Email("bob@xxx.xxx")
                              .City("台中")
                              .build());
        list.add( new com.sample.Person.Builder()
                              .num("A102")
                              .name("Jane")
                              .age(28)
                              .Email("jane@xxx.xxx")
                              .City("台南")
                              .build());
        list.add( new com.sample.Person.Builder()
                              .num("B101")
                              .name("John")
                              .age(31)
                              .Email("john@xxx.xxx")
                              .City("高雄")
                              .build());
        list.add( new com.sample.Person.Builder()
                              .num("B102")
                              .name("Lisa")
                              .age(22)
                              .Email("lisa@xxx.xxx")
                              .City("高雄")
                              .build());
        list.add( new com.sample.Person.Builder()
                              .num("C101")
                              .name("Betty")
                              .age(30)
                              .Email("betty@xxx.xxx")
                              .City("台北")
                              .build());
        list.add( new com.sample.Person.Builder()
                              .num("C102")
                              .name("Amy")
                              .age(32)
                              .Email("amy@xxx.xxx")
                              .City("台南")
                              .build());
        return list;
    }
}


    