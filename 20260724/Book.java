/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanple;

import java.util.Objects;

/**
 *
 * @author student
 */
public class Book {
    private String name ;
    private char type ;
    private int price ;
    
    public Book(String name,char type,int price) {
        this.name = name ;
        this.type = type ;
        this.price = price ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    //為了要看懂內容
    @Override
    public String toString() {
        return  "書名：" + name +
                "\n書本編冊：" + type +
                "\n書本價格：" + price ;
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode(); 
//    }
    
    
    
    
    //重新定義equals
    //比對內容：預設使用 == 比較是否同一個記憶體位置
    //邏輯相等：改寫後能讓兩個內容相同的獨立物件被視為相同
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true ;
        }
        if (obj == null){
            return false ;
        }
        if (getClass() != obj.getClass()){
            return false ;
        }
        final Book other = (Book) obj ;
        if (this.type != other.type) {
            return false ;
        }
        if (this.price != other.price){
            return false ;
        }
        return  Objects.equals(this.name , other.name) ;
    }

    
    
    
    
}
