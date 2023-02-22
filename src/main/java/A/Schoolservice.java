package A;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.school.Grade;
import com.mycompany.school.Schoolclass;
import  com.mycompany.school.Students;
import  com.mycompany.school.Teachers;
public class Schoolservice {
    Schoolclass School;

    public Schoolservice(Schoolclass School) {
        this.School = School;
    }
    
    public void Setschool(Schoolclass e)
    {
    School=e;
    }
    
    public Schoolclass getschool()
    {
    return School;
    }
    
    public void addstudent(Students student)
    {
    this.School.getStudents().add(student);
    }
    
    public void addteacher(Teachers teacher)
    {
    this.School.getTechers().add(teacher);
    }
    
    public void addgrade(Grade grade)
    {
    this.School.getGrade().add(grade);
    }
    
    public void removestudent(Students student)
    {
    this.School.getStudents().remove(student);
    }
    
    public void removeteacher(Teachers teacher)
    {
    this.School.getTechers().remove(teacher);
    }
    
    public void removegrade(Grade grade)
    {
    this.School.getGrade().remove(grade);
    } 
    
    public Students getstudentbyname(String name)
    {
       
    for(Students student:this.School.getStudents())
    {
    if(student.getName().toUpperCase().equals(name.toUpperCase()))
    {
    return student;
    }
    
    }
    
    return null;
    }
    
     public Teachers getteacherbyname(String name)
      {
      for(Teachers teachare:this.School.getTechers())
      {
          if(teachare.getName().toUpperCase().equals(name.toUpperCase()))
          {
         return teachare; 
          }       
      }
       return null;
      }  
     public Grade getgradebyname(String name)
      {
      for(Grade grade:this.School.getGrade())
      {
          if(grade.getName().toUpperCase().equals(name.toUpperCase()))
          {
         return grade; 
          }       
      }
       return null;
      }
     
     

}
