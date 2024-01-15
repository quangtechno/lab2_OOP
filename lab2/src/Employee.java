/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class Employee {
    String Employee_code;
    String Employee_name;
    int yearsOfService;
    double salary_Coefficient;
    double basicSalary;
    double salary;

    public Employee(String Employee_code, String Employee_name, int yearsOfService, double salary_Coefficient, double basicSalary) {
        this.Employee_code = Employee_code;
        this.Employee_name = Employee_name;
        this.yearsOfService = yearsOfService;
        this.salary_Coefficient = salary_Coefficient;
        this.basicSalary = basicSalary;
        this.salary=calculate_salary();
    }
   
public void print(){
    System.out.println(this.toString());
}
 public String toString(){
String temp="Employee code : "+Employee_code+"\n"+"Employee name : "+Employee_name+"\n"+"Years of service : "+yearsOfService+"\n"+
        "salary coefficient : "+salary_Coefficient+"\n"+"basic salary : "+basicSalary+"\n"+"salary : "+calculate_salary()+"\n"+"===============";
return temp;
}
 public double calculate_salary(){
     this.salary=basicSalary*salary_Coefficient;
     return salary;
 }
 public void printSalary(){
     System.out.print(" "+this.salary+" ");
 }
}