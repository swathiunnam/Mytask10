package oops;

import java.util.Scanner;

public class Employee {
   
int id;
   String firstName;
   String lastName;
   String name;
   int salary;
   int totalSal;

  public  Employee(int id,String firstName,String lastName,int salary){
    this.id=id;
   this. firstName=firstName;
   this.lastName=lastName;
    this.salary=salary;
  }
  int getID(){
    return id;
  }
  String getFirstName(){
    return firstName;
  }
  String getLastName(){
    return lastName;
  }
 
  String getName(){
    
    return name=firstName+lastName;
  }
  int getSalary(){
    return salary;
  }
int getAnnualSalary(){
    return salary*12;

}
  int raiseSal(int percent){
    totalSal=salary+(salary*percent/100);
    return totalSal;

 }
 public String toString(){
    return id+" "+ name +" "+ totalSal;
    
 }
 
    public static void main(String[] args) {
       Employee employee=new Employee(101, "swathi", "unnam", 100);
       System.out.println(employee.getID());
       System.out.println(employee.getFirstName());
       System.out.println(employee.getLastName());
       System.out.println(employee.getName());
       System.out.println(employee.getSalary());
       System.out.println(employee.getAnnualSalary());
       employee.raiseSal(10);
      System.out.println("employee total salary after hike:"+employee.raiseSal(10));
      System.out.println(employee.toString());

  
    }
}  

