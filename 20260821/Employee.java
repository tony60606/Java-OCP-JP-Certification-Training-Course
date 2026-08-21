/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sample;

import java.time.LocalDate;

/**
 *
 * @author ttoon
 */
public class Employee {
    
    private int ID ; //自動編號
    private String firstname ;
    private String lastname ;
    private LocalDate birthday ;
    private int salary ;

    public Employee() {
    }

    public Employee(String firstname, String lastname, LocalDate birthday, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("ID : %02d | %s | %s | Birthday : %s | Salary : %d",ID,firstname,lastname,birthday,salary) ;
    }
    
    
    
}
