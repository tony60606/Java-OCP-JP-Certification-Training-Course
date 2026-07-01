/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.util.Arrays;

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
        //宣告、實作、初始化一維陣列
        //語法:資料型別 [] 陣列名稱 = {元素1,元素2,元素3,.......}
        String [] car = {"Toyota","Honda","Ford","Tesla","BMW","Benz"} ;
        //直接print => 無法直接印出陣列內容(只會顯示該陣列為和型別陣列)
        System.out.println("car:" + car);
        //使用Arrays類別中的toString:快速查看陣列內容
        System.out.println("car：" + Arrays.toString(car));
        System.out.println("---------------------------");
        //索引值取值(從0開始)=> 陣列名稱[索引值]
        System.out.println("car[0]：" + car[0]);
        System.out.println("car[1]：" + car[1]);
        System.out.println("car[2]：" + car[2]);
        System.out.println("car[3]：" + car[3]);
        System.out.println("car[4]：" + car[4]);
        System.out.println("car[5]：" + car[5]);
        System.out.println("---------------------------");
        //迴圈取值：for迴圈
        for (int i = 0 ;i < car.length; i++) {
            System.out.println("car["+ i +"]：" + car[i]);
        }
        System.out.println("---------------------------");
        //迴圈取值：while迴圈
        int j = 0 ;
        while (j < car.length) {
            System.out.println("car["+ j +"]：" + car[j]);
            j++ ;
        }
        System.out.println("---------------------------");
        //修改陣列值=> 陣列名稱[索引值] = 新值
        car[3] = "Audi" ;
        System.out.println("car：" + Arrays.toString(car));
        System.out.println("---------------------------");
        System.out.println("陣列長度" + car.length);
        System.out.println("陣列記憶體位址" + System.identityHashCode(car));
        System.out.println("---------------------------");
        //宣告、實作、初始化一維陣列
        //語法一： 宣告 => 型別 [] 陣列名稱 ;
        //        實作 => 陣列名稱 = new 型別[指定陣列長度]
        //語法二： 型別 [] 陣列名稱 = new 型別[指定陣列長度]
        /*基本型別的預設值：
            1.整數(byte.short.int.long) => 0
            2.浮點數(float.double) => 0.0
            3.字元(char) => '\u0000'
            4.邏輯(boolean) => False
          參考型別的預設值： null
        */
        //int age = new int[] => 會編譯失敗，因沒指定陣列長度
        int [] ages = new int [3] ;
        System.out.println("ages：" + Arrays.toString(ages));
        //指定資料
        ages[0] = 30;
        ages[1] = 40;
        ages[2] = 50;
        //增強型迴圈語法 => for (資料型別 自訂變數名稱 : 陣列名稱) {執行程式碼} =>不確定資料型別,可以用var
        for(var i : ages){  //嘗試int age 改成 var age
            System.out.printf("% d |%n",i);
        }
        System.out.println("---------------------------");
        //可能會遇到的陣列宣告
        int[] test1 = new int[]{1,3,5,7,9} ; //new 資料型別[]{元素一,元素二,元素三,.....} => []內不可寫長度
        System.out.println("test1：" + Arrays.toString(test1));
        //若要重新指定陣列(不能直接宣告 陣列名稱 = {元素一,元素二,元素三,.....})
        //語法:陣列名稱 = new 資料型態 [] {元素一,元素二,元素三,.....} ;
        test1 = new int[]{2,4,6} ;
        System.out.println("test1：" + Arrays.toString(test1));
        //注意： all in one line 的程式碼，不可以拆成兩行寫
        int[] test2 ;
        test2 = new int[]{11,22,33,44,55} ;
        System.out.println("test2：" + Arrays.toString(test2));
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        //宣告多維陣列
        //二維陣列長度相同
//        int [][] ids = {{11,12},{21,22},{31,32}} ;
        int [][] ids = {{1,3},{2,4,6},{13,15,19,21,22,55}} ;
        //查看陣列內容
        System.out.println(Arrays.deepToString(ids));
        //查看陣列長度
        System.out.println("ids長度：" + ids.length);
        System.out.println("ids長度[0]：" + ids[0].length);
        System.out.println("ids長度[1]：" + ids[1].length);
        System.out.println("ids長度[2]：" + ids[2].length);
        System.out.println("---------------------------");
        //雙層for迴圈
        for (int i = 0 ; i < ids.length ; i++) {
            System.out.println(ids[i] + "：");
            for (int c = 0 ; c < ids[i].length ; c++) {
                System.out.println(ids[i][c] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        //增強for迴圈
        for(int[] temp : ids) {
            for(int i : temp) {
                System.out.printf("%d|",i);
            }
            System.out.println();
        }
        //取值
        System.out.println("ids[1][2]：" + ids[1][2]);
        System.out.println("---------------------------");
        
        //宣告長度相同2維陣列
        int[][] test3 = new int[5][4] ;
        System.out.println(Arrays.deepToString(test3));
        //宣告長度不相同
        int[][] test4 = new int[4][] ;
        test4[0] = new int[2] ; 
        test4[1] = new int[3] ; 
        test4[2] = new int[4] ; 
        test4[3] = new int[5] ; 
        System.out.println(Arrays.deepToString(test4));
        
    }
    
}
