/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sample;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ttoon
 */
public class MainClass1 {

    // 類別成員屬性
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeDAO dao = new EmployeeDAO() ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(true){
            printMenu();
            
            String choice = scanner.nextLine();
            
            switch(choice){
                case "1":
                    System.out.println("** 新增資料表 **");
                    dao.createTable();
                    break;
                case "2":
                    System.out.println("** 新增單筆紀錄 **");
                    addSingle();
                    break;
                case "3":
                    System.out.println("** 新增多筆紀錄 **");
                    batchInsert();
                    break;
                case "4":
                    System.out.println("** 查詢全部記錄 **");
                    listAll();
                    break;
                case "5":
                    System.out.println("** 依條件查詢 **");
                    // queryByCondition();
                    break;
                case "6":
                    System.out.println("** 修改紀錄 **");
                    // updateRecord();
                    break;
                case "7":
                    System.out.println("** 刪除紀錄 **");
                    // deleteRecord();
                    break;
                case "8":
                    System.out.println("** 程式結束 **");
                    return;     // 中斷方法執行
                default:
                    System.out.println("無效選項!!");
                    
            }
            
        }
        
    }
    
    // 顯示選單
    private static void printMenu(){
        System.out.println("\n員工資料庫系統");
        // 選單項目
        List<String> menuList = List.of("1) 新增資料表", "2) 新增單筆紀錄",
                                        "3) 新增多筆紀錄", "4) 查詢全部記錄",
                                        "5) 依條件查詢", "6) 修改紀錄", 
                                        "7) 刪除紀錄", "8) 結束");
        System.out.println("=====================");
        menuList.stream().forEach(System.out::println);
        System.out.println("=====================");
        System.out.print("--> ");       
        
    }
    
    // ===== 輔助輸入方法 =====
    // 檢查字串資料
    private static String readLine(String prompt){
        System.out.print(prompt);
        String s = scanner.nextLine().trim();
        while(s.isEmpty()){
            System.out.println("此欄位不可為空白!");
            System.out.print(prompt);
            s = scanner.nextLine().trim();
        }
        return s;
    }
    
    // 檢查日期資料
    private static LocalDate readDate(String prompt){
        while(true){
            try{
                System.out.print(prompt);
                String s = scanner.nextLine().trim();
                return LocalDate.parse(s);  // 直接用 ISO-8601 格式 yyyy-MM-dd
            }catch(Exception ex){
                System.out.println("日期格式錯誤，請使用 yyyy-MM-dd");
            }
        }
    }
    
    // 檢查整數資料
    private static int readInt(String prompt){
        while(true){
            try{
                System.out.print(prompt);
                String s = scanner.nextLine().trim();
                return Integer.parseInt(s);
            }catch(Exception ex){
                System.out.println("請輸入有效的整數");
            }
        }
    }
    
    //新增單筆紀錄
    private static void addSingle() {
        String fn = readLine("Firstname : ") ;
        String ln = readLine("Lastname : ") ;
        LocalDate bd = readDate("Birthday(yyyy-mm-dd) : ") ;
        int sal = readInt("Salary : ") ;
        dao.insert(new Employee(fn,ln,bd,sal)) ;
    }
    //新增多筆紀錄
    private static void batchInsert() {
        String[] sqls = new String[10];
        sqls[0] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Kenny', 'Arlington', '2005-03-01', 36000)";
        sqls[1] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Duke', 'Wang', '2004-04-06', 46000)";
        sqls[2] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Jacky', 'Lee', '1970-10-31', 38000)";
        sqls[3] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Louis', 'Chen', '2002-06-08', 33500)";
        sqls[4] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Carl', 'Wang', '2001-07-09', 48000)";
        sqls[5] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Haley', 'Lin', '2005-03-01', 32000)";
        sqls[6] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Michael', 'McGinn', '1986-08-11', 50000)";
        sqls[7] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Thomas', 'Heimer', '2003-05-07', 33000)";
        sqls[8] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Peter', 'Forrester', '1979-01-25', 42000)";
        sqls[9] = "INSERT INTO EMPLOYEE (firstname, lastname, birthday, salary) VALUES('Cindy', 'Wang', '2001-07-09', 34000)";
        
        dao.insert(sqls);
    }

    private static void listAll() {
        List<Employee> list = dao.Search() ;
        if (list.isEmpty()) {
            System.out.println("目前查無資料");
        } else {
            list.forEach(System.out :: println);
        }
    }
    
}
