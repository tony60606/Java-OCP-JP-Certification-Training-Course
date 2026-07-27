/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.io.IOException;
import java.util.Random;
import java.sql.SQLException ;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class CheckException {
    public static void main(String[] args) {
        try {
            dotest();
        } catch (IOException ex) {
            System.out.println("main()：" + ex);
        } catch (SQLException ex) {
            System.out.println("main()：" + ex.getMessage());
        } catch (MyException ex) {
             System.out.println("main()：" + ex + ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        System.out.println("程式執行結束!!");
    }

    private static void dotest() throws IOException, SQLException, MyException {
        double random = new Random().nextDouble() ;
        System.out.println("請輸入小數：");
        Scanner sca = new Scanner(System.in) ;
        double a = sca.nextDouble();
        System.out.println("random = " + random);
        
        if (random >= a) {
            //建立ArithmeticException 例外物件(UncheckException)
            //UncheckException：程式中沒有例外處理機制(沒有強迫撰寫例外機制)，程式可以編譯成功，但程式執行時可能會產生錯誤
            //手動拋出一個例外物件，建立例外物件 throw new 例外型別(自訂訊息)
            throw new ArithmeticException("除數不可為0") ;
        } else if (random <= 0.9){
            //建立IOException例外物件(CheckException)
            throw new IOException("I/O錯誤") ;
        } else if (random == 0.0) {
            try {
                throw new SQLException("SQL錯誤") ;
            } catch (SQLException ex) {
                System.out.println("dotest()：SQL事件紀錄完成");
                //例外再拋
                throw ex ;
            }
        
        } else if (random >= 0.2) {
            throw new MyException("小明",5566) ;
        } else {
            System.out.println("系統正常");
        }
        
    }
}
