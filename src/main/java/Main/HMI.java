/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import A.Schoolservice;
import com.mycompany.school.Schoolclass;
import com.mycompany.school.Students;
import com.mycompany.school.Teachers;
import java.util.Scanner;

public class HMI {
    private static Students student=new Students();
     static Scanner input=new Scanner(System.in);
private static Schoolservice schoolservice;
     Schoolclass school= HMI.createschool();
         
     public static void start()
    {       Schoolclass schoolclass=new Schoolclass();
  Schoolclass school= HMI.createschool();
  Schoolservice schoolservice=new Schoolservice(school);
    System.out.println("welcome to "+school.getName()+" in "+school.getAddress()+" phone = "+school.getPhonenumber());
      String action ;
     do{
        
        System.out.println("what do you want to do option id[addStudent = < 1 > : printallstudents = < 2 > : addteacher = <3> : printallteacher = <4> : Find student by name= <5> : Find teacher by name = <6> : ] , if you want to wxit the program write 'exit' ");
 action=input.next();
 
 
 if(action.equals("1"))//case1
 {
 Students student=new Students();
  System.out.println("");
 System.out.println("enter the Name");
 student.setName(input.next());
 System.out.println("enter the AGE");
 student.setAge(input.nextInt());
 System.out.println("enter parient phone number ");
 student.setParientphonenumber(input.next());
 schoolservice.addstudent(student);
 }
 //
 if(action.equals("2"))//case2
 {
 for(Students student:school.getStudents())
 {
System.out.println("  <name> = "+student.getName()+"  <the age> = : "+student.getAge()+" :  <phone> = "+student.getParientphonenumber());
 }
 //
 }
    
if(action.equals("3"))   
{  
    HMI.addteacher(school);
}
if(action.equals("4"))
{
HMI.printallteachers();
}
if(action.equals("5"))
{
HMI.findstudentbyname();
}
if(action.equals("6"))
{
HMI.findteacerbyname();
}

     }
    while(!action.equals("exit"));
    
    }
   
     
    private static Schoolclass createschool()
    {
      HMI.student=new Students();
    Schoolclass school=new Schoolclass(); 
    school.setName("nazla elgenedy");
    school.setAddress("maymon");
    school.setPhonenumber("01147440577");
    HMI.schoolservice=new Schoolservice(school); 
    return school;
}
    private  static void addteacher(Schoolclass school)
    {
        
    Teachers teachers=new Teachers();
 System.out.println("");
 System.out.println("enter the Name");
 teachers.setName(input.next());
  System.out.println("enter the AGE");
 teachers.setAge(input.nextInt());
  System.out.println("enter the Salary");
 teachers.setSalary(input.nextDouble());
 Schoolservice schoolservice=new Schoolservice(school);
 schoolservice.addteacher(teachers);
    }
private static void printallteachers()
{
   
for(Teachers teachers : HMI.schoolservice.getschool().getTechers())
{
System.out.println("  <name> = "+teachers.getName()+"  <the age> = "+teachers.getAge()+" :  <Salary> = "+teachers.getSalary());
}
}

private static void findstudentbyname()
{
    System.out.println(" please enter the name ");
String name=input.next();
Students student=HMI.schoolservice.getstudentbyname(name);
if(student==null)
{
System.out.println("not find !! ");
}
else
System.out.println("  <name> = "+student.getName()+"  <the age> = : "+student.getAge()+" :  <phone> = "+student.getParientphonenumber());
}

private static void findteacerbyname()
{
    System.out.println(" please enter the name ");
String name=input.next();
Teachers teacher=HMI.schoolservice.getteacherbyname(name);
if(teacher==null)
{
System.out.println("not find !! ");
}
else
System.out.println("  <name> = "+teacher.getName()+"  <the age> = : "+teacher.getAge()+" :  <Salary> = "+teacher.getSalary());
}


}
