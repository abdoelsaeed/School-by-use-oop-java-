/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

/**
 *
 * @author abdoe
 */
public class Students extends Person{
    String parientphonenumber;

    public Students() {
    }

    public Students(String parientphonenumber, String name, int age) {
        super(name, age);
        this.parientphonenumber = parientphonenumber;
    }



    public String getParientphonenumber() {
        return parientphonenumber;
    }

    public void setParientphonenumber(String parientphonenumber) {
        this.parientphonenumber = parientphonenumber;
    }
    
}
