/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

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
        //舊式日期時間類別：早期
        Date oldDate = new Date() ;
        System.out.println(oldDate);
        System.out.println("--------------------");
        
        //資料用 ISO-8601表示
        //建立日期
        LocalDate date1 = LocalDate.now() ;
        System.out.println("date1 = " + date1);
        System.out.println("--------------------");
        LocalDate date2 = LocalDate.of(2026,4,17) ;
        System.out.println("date2 = " + date2);
        System.out.println("---------------D-----");
        LocalDate date3 = LocalDate.of(2026, Month.APRIL, 30) ;
        System.out.println("date3 = " + date3);
        System.out.println("--------------------");
        LocalDate date4 = LocalDate.parse("2026-02-28") ;
        System.out.println("date4 = " + date4);
        System.out.println("--------------------");
        //建立時間
        LocalTime time1 = LocalTime.now() ;
        System.out.println("time1 = " + time1);
        System.out.println("--------------------");
        LocalTime time2 = LocalTime.of(15, 15, 15);
        System.out.println("time2 = " + time2);
        System.out.println("--------------------");
        LocalTime time3 = LocalTime.parse("12:25:55");
        System.out.println("time3 = " + time3);
        System.out.println("--------------------");
        //建立日期時間
        LocalDateTime datetime1 = LocalDateTime.now();
        System.out.println("datetime1 = " + datetime1);
        System.out.println("--------------------");
        LocalDateTime datetime2 = LocalDateTime.of(1996, Month.APRIL, 17, 20, 18, 55) ;
        System.out.println("datetime2 = " + datetime2);
        System.out.println("--------------------");
        //日期取值
        System.out.println("年：" + datetime1.getYear());
        System.out.println("月(英文)：" + datetime1.getMonth());
        System.out.println("月(數字)：" + datetime1.getMonthValue());
        System.out.println("日：" + datetime1.getDayOfMonth());
        System.out.println("星期：" + datetime1.getDayOfWeek());
        System.out.println("今天是今年第幾天：" + datetime1.getDayOfYear());
        System.out.println("時：" + datetime1.getHour());
        System.out.println("分：" + datetime1.getMinute());
        System.out.println("秒：" + datetime1.getSecond());
        System.out.println("奈秒：" + datetime1.getNano());
        System.out.println("--------------------");
        //格式化
        System.out.println("日期：" + datetime1.format(DateTimeFormatter.ISO_DATE));
        System.out.println("時間：" + datetime1.format(DateTimeFormatter.ISO_TIME));
        System.out.println("--------------------");
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println("--------------------");
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
        System.out.println("--------------------");
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(datetime1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        
        //曆法
        MinguoDate minguo = MinguoDate.now() ;
        System.out.println("民國 : " + minguo );
        JapaneseDate japan = JapaneseDate.now() ;
        System.out.println("日本時間：" + japan);
        
        //計算
        System.out.println(date1.plusDays(35));
        System.out.println(date1.minusDays(35));
        System.out.println(date1.plusWeeks(2).plusDays(15).plusMonths(4));
        
        //判斷是否潤年
        System.out.printf("%s 年是否是閏年：%b %n",date1.getYear(),date1.isLeapYear());
    }
    
}
