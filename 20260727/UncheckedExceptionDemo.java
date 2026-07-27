/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */

//快速執行程式：<shift> + F6 or 滑鼠右鍵 -> run file
public class UncheckedExceptionDemo {
    
    //主方法快速建立：先輸入 main 再按 tab鍵
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        
        try {
            //有可能發生錯誤的程式碼寫在try{}內
            System.out.println("輸入被除數 a ：");
            int a = scanner.nextInt() ;
            System.out.println("輸入除數 b ：");
            int b = scanner.nextInt() ;
            int c = cal(a,b) ;
            System.out.printf("%d / %d = %d%n",a,b,c);
        } catch (ArithmeticException ex){
            System.out.println("[錯誤]" + ex);
            System.out.println("[message]" + ex.getMessage());
        } catch (InputMismatchException ex) {
            System.out.println("[錯誤]" + ex);
            System.out.println("[message]" + ex.getMessage());
        }
            System.out.println("程式執行結束!!");
    }

    private static int cal(int a, int b) {
        System.out.println("準備計算....");
        
        return a / b ;
    }
}
