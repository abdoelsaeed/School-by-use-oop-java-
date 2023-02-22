/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

import java.util.ArrayList;

/**
 *
 * @author abdoe
 */
public class Schoolclass {
    String name;
    String address;
    String phonenumber;
    ArrayList<Students>students;
    ArrayList<Teachers>techers;
    ArrayList<Grade>grade;
    public Schoolclass() {
        this.arraylist_object();
    }

    public Schoolclass(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.arraylist_object();
    }
     private void arraylist_object()
     {
     this.students=new ArrayList<Students>();
     this.techers=new ArrayList<Teachers>();
     this.grade=new ArrayList<Grade>();
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public ArrayList<Teachers> getTechers() {
        return techers;
    }

    public ArrayList<Grade> getGrade() {
        return grade;
    }

}
