/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

/**
 *
 * @author student
 */

//若要將自訂類別建立的物件放入集合中(TreeSet or TreeMap)，需要實作comparable介面
//單一個class只能實作一次comparable介面，所以只能提供單一方式拍排序
public class Student implements Comparable<Student>  {
    private String name ;
    private int ID ;
    private double DPA ;

    public Student(String name, int ID, double DPA) {
        this.name = name;
        this.ID = ID;
        this.DPA = DPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getDPA() {
        return DPA;
    }

    public void setDPA(double DPA) {
        this.DPA = DPA;
    }

    @Override
    public String toString() {
        return   name + "\t" + ID + "\t" + DPA;
    }

    
    //實作compareTo()比較，比較自己(this)跟方法物件參數 o
    //只能提供一種排序規則
    //Override 用int規則
    @Override
    public int compareTo(Student o) {
//        if (this.ID > o.getID()) {
//            return 1 ;
//        } else if (this.ID == o.getID()){
//            return 0 ;
//        } else {
//            return -1 ;
//        }
    //用String規則:String已經有實作Comparable
//    return this.name.compareTo(o.getName()) ;
    //用Double規則(小>大)
    //可將double裝箱成Double，再呼叫Double實作的compareTo()
//        return Double.valueOf(this.DPA).compareTo(o.getDPA()) ;
    //用Double規則(大>小)
        return Double.valueOf(this.DPA).compareTo(o.getDPA())*-1 ;
    
    

    }
    
    
    
    
}
