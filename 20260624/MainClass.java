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
        System.out.println("Hallo JAVA");
        System.out.println("中文測試");

        System.out.println("----------------------");// TODO code application logic here
        
        int age = 30 ;
        String name = "鄭仕遠" ;
        double weight = 128 ;
        float height = 171.2f ;
        double BMI = weight / ((height/100)*(height/100)) ;
        System.out.println("學員姓名："+name+"\n年齡："+age+"歲\n身高為："+height+"公分\n體重為："+weight+"公斤\nBMI為："+BMI);
        System.out.println("----------------------");
        var name2 = "方小名" ;
        var age2 = 18 ;
        var weight2 = 70f ; 
        var height2 = 180d ;
        var BMI2 = weight2 / ((height2/100)*(height2/100));
        System.out.println("學員姓名："+name2+"\n年齡："+age2+"歲\n身高為："+height2+"公分\n體重為："+weight2+"公斤\nBMI為："+BMI2);
        System.out.println("-----------------------");
        var a1 = 123_456_789_101L ;
        System.out.println(a1);
        var a2 = 0b1000_0000_1010_1110 ;
        System.out.println(a2);
        var a3 = 3.1_415926 ;
        System.out.println(a3); 
        System.out.println("-----------------------");
        System.out.printf("姓名：%s，年齡%d歲，BMI：%.2f%n",name,age,BMI);    
        System.out.println("-----------------------");
        System.out.printf("|%d|%n",13579);
        System.out.printf("|%15d|%n",13579);
        System.out.printf("|%-10d|%n",13579);
        System.out.println("-----------------------");
        System.out.printf("%c%04d%n",'A',5);
        System.out.printf("%c%04d%n",'A',44);
        System.out.printf("%c%04d%n",'B',507);
        System.out.printf("%c%04d%n",'J',1111);
        System.out.println("-----------------------");
        System.out.printf("%05d%n",20);
        System.out.printf("%05d%n",1);
        System.out.printf("%05d%n",10085);
        System.out.printf("%05d%n",201);
        System.out.printf("%05d%n",441);
        System.out.println("-----------------------");
        System.out.printf("%f%n",3.1415926);
        System.out.printf("%f%n",3.14);
        System.out.println("-----------------------");
        System.out.printf("%7.3f%n",7654321.123456);
        System.out.printf("%7.3f%n",765432.1123456);
        System.out.printf("%7.3f%n",76543.21123456);
        System.out.printf("%7.3f%n",7654.321123456);
        System.out.printf("%7.3f%n",765.4321123456);
    
    }
    
}
