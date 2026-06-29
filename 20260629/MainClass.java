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
        // TODO code application logic here
        //字元 char 基本型別:一對單引號將一個符號包住
        char A1 = 'A' ;
        System.out.println(A1);
        //字串 String 參考型別：一對雙引號將0~多個字元包住
        //建議宣告方式：因String支援非標準語法，JAVA會將建立的字串物件儲存於字串池(String Pool)
        //如果A.B同時指向一個字串物件,修改其中一個內容,另一個變數的內容不會改變(因字串池允許記憶體共用,但String有不可變特性,因此修改內容會找一個新的位址儲存)
        String A2 = "Apple" ;
        System.out.println("記憶體位址" + System.identityHashCode(A2));
        String A3 = "APPLE" ;
        String A4 = "apple" ;
        System.out.println("記憶體位址" + System.identityHashCode(A3));
        System.out.println("記憶體位址" + System.identityHashCode(A4));
        System.out.println("--------------------");
        //new 方式建立
        String A5 = new String("APPLE") ;
        System.out.println("記憶體位址" + System.identityHashCode(A5));
        String A6 = A4 ;
        System.out.println("記憶體位址" + System.identityHashCode(A6));
        System.out.println("--------------------");
        //用==比較字串：比較記憶體位址
        System.out.println("A3 == A5：" + (A3==A5));
        System.out.println("A4 == A6：" + (A4==A6));
        System.out.println("--------------------");
        //用.equals()比較字串：比較字串內容
        System.out.printf("比較 %s 跟 %s 是否相同：%b%n",A2,A3,A2.equals(A3));
        System.out.printf("比較 %s 跟 %s 是否相同：%b%n",A3,A5,A3.equals(A5));
        System.out.printf("比較 %s 跟 %s 是否相同：%b%n",A4,A6,A4.equals(A6));
        System.out.println("--------------------");
        //String不可變特性
        A4 = A4 + "，" ;
        System.out.println("A4=" + A4 + "記憶體位址" + System.identityHashCode(A4));
        System.out.println("A6=" + A6 + "記憶體位址" + System.identityHashCode(A6));
        System.out.println("--------------------");
        //資料串接：+
        String A7 = "AAA" ;
        String A8 = "BBB" ;
        String A9 = A7 + A8 ; //運算式左邊需有變數
        System.out.println(A9);
        //資料串接：concat()
        A7 = A7.concat("CCC");
        System.out.println(A7);
        System.out.println("--------------------");
        //字串長度
        String A10 = " An apple a day ， Keep a doctor away " ;       
        System.out.println(A10);
        System.out.println("A10字串長度：" + A10.length());
        //首尾去空白
        A10 = A10.trim() ;
        System.out.println(A10);
        System.out.println("A10字串長度：" + A10.length());
        //字串轉大小寫
        System.out.println("A10字串轉大寫：" + A10.toUpperCase());
        System.out.println("A10字串轉小寫：" + A10.toLowerCase());
        System.out.println("--------------------");
        //開頭文字是否為__
        System.out.println("A10開頭字母是否為An：" + A10.startsWith("An"));
        System.out.println("A10開頭字母是否為an：" + A10.startsWith("an"));
        //結尾文字是否為__
        System.out.println("A10結尾是否為away：" + A10.endsWith("away"));
        System.out.println("--------------------");
        System.out.println("0123456789012345678901234567890123456789");
        System.out.println(A10);
        //取出指定索引位置
        System.out.println(A10.charAt(12));
        //取出部分字串
        System.out.println(A10.substring(6, 19));
        System.out.println(A10.substring(15));
        //尋找指定字串第一個出現的索引位址
        System.out.println(A10.indexOf("a"));
        //尋找指定字串最後一個出現的索引位址
        System.out.println(A10.lastIndexOf("a"));
        //找不到資料
        System.out.println(A10.indexOf("Apple"));
        //從指定位址開始找資料
        System.out.println(A10.indexOf("a", 10));
        System.out.println("--------------------");
        //StringBuilder
        StringBuilder A11 = new StringBuilder() ;
        System.out.println("A11的記憶體位址" + System.identityHashCode(A11));
        A11.append("JDK");
        System.out.println("A11："+A11+"，A11的記憶體位址" + System.identityHashCode(A11));
        A11.append(14).append("ACL") ;
        System.out.println("A11："+A11+"，A11的記憶體位址" + System.identityHashCode(A11));
        System.out.println("A11字串長度：" + A11.length());
        System.out.println("--------------------");
        //指定位置插入符號
        A11.insert(3, "-") ;
        System.out.println(A11);
        //刪除指定範圍
        A11.delete(6, 9);
        System.out.println(A11);
        System.out.println("--------------------");
        //字串型態資料轉換
        String SH = "171.45" ;
        String SW = "75" ;
        double h = Double.parseDouble(SH) ; //字串轉double
        int w = Integer.parseInt(SW) ; //字串轉int
        double BMI = w / ((h/100)*(h/100));
        System.out.printf("身高：%.2f公分，體重：%d公斤，BMI為%.2f",h,w,BMI);
        
    }
    
}
