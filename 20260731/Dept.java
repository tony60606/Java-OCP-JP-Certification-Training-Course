/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.sample;

/**
 *
 * @author ttoon
 */
public enum Dept {
    //列舉值(列舉常數) => 須放在程式最前面
    //建構子如需參數，須由列舉值提供
    HR("Dept-1"),Sales("Dept-2"),Marketing("Dept-3"),Finance("Dept-4") ;
    
    //屬性
    private String deptCode ;
    
    //建構子
    //建構子不能被實作(new),因此只能用private
    private Dept(String deptCode) {
        this.deptCode = deptCode ;
    }
    
    public String getdeptCode(){
        return deptCode ;
    }
    
}
