/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

//手動輸入
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException;

/**
 *
 * @author ttoon
 */
public class DBUtil {
    
    private static final String URL = "jdbc:derby://localhost:1527/EmployeeDB" ;
    private static final String User = "app" ;
    private static final String Password = "app" ;
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,User,Password) ;
    
    }
}
