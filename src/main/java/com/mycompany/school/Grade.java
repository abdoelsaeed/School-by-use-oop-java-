/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

import java.util.ArrayList;
public class Grade {
    String code;
    String name;
    Teachers techares;
    ArrayList<Students>students;

    public Grade() {
    }

    public Grade(String code, String name) {
        this.code = code;
        this.name = name;
      
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teachers getTechares() {
        return techares;
    }

    public void setTechares(Teachers techares) {
        this.techares = techares;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }
    
    public void addstudent(Students student)
    {
    students.add(student);
    }
    
    public void removestudent(Students student)
    {
        students.remove(student);
    }
    
    public void addteacher(Teachers teacher)
    {
    techares=teacher;
    }
    
     public void removeteacher(Teachers teacher)
    {
    techares=teacher;
    }
}
