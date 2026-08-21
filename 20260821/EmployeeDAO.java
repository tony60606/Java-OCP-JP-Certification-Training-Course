/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.sql.Connection ;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.ResultSet ;

/**
 *
 * @author ttoon
 */
public class EmployeeDAO {
    
    // https://www.1keydata.com/tw/sql/sql.html SQL參考語法
    
    // 建立資料表
    public void createTable(){
        String sql = "CREATE TABLE EMPLOYEE("
                + "id INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),"
                + "firstname VARCHAR(20),"
                + "lastname VARCHAR(20),"
                + "birthday DATE,"
                + "salary INT)";
        try(Connection conn = DBUtil.getConnection();
                Statement stmt = conn.createStatement()){            
            stmt.executeUpdate(sql);
            System.out.println("資料表 EMPLOYEE 建立完成!");
        } catch (SQLException ex) {
            System.out.println("資料表可能已存在：" + ex.getMessage());
        } catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    //單筆新增
    public void insert(Employee emp) {
    
        String sql = String.format("INSERT INTO EMPLOYEE (firstname,lastname,birthday,salary) VALUES ('%s','%s','%s',%d)",
                    emp.getFirstname(),emp.getLastname(),emp.getBirthday(),emp.getSalary()) ;
    
        try (Connection conn = DBUtil.getConnection();
                Statement stmt = conn.createStatement()) {
            int result = stmt.executeUpdate(sql) ;
             System.out.println("【訊息】新增成功，異動筆數：" + result);
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
        
    }
    
    public void insert(String[] data) {
        try (Connection conn = DBUtil.getConnection();
            Statement stmt = conn.createStatement()) {
            for(String s : data) {
                stmt.addBatch(s);
            }
            int[] results = stmt.executeBatch() ;
            System.out.println("【訊息】新增成功，異動筆數：" + Arrays.toString(results));
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
    
    
    }
    
    public List<Employee> Search() {
        List<Employee> list = new ArrayList() ;
        String sql = "SELECT * FROM EMPLOYEE" ;
        try (Connection conn = DBUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet RS = stmt.executeQuery(sql)) {
            
            while(RS.next()) {
                list.add(mapRow(RS)) ;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
        return list ; 
    }
    
    //協助建立 Employee 物件 
    private Employee mapRow(ResultSet RS) throws SQLException {
        Employee emp = new Employee() ;
        emp.setID(RS.getInt("ID"));
        emp.setFirstname(RS.getString("firstname"));
        emp.setLastname(RS.getString("lastname"));
        emp.setBirthday(RS.getDate("birthday").toLocalDate()) ;
        emp.setSalary(RS.getInt("salary"));
        return emp ;
    }
    
}
