
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question3 {
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the number of Employees");
        int n=reader.nextInt();
        ArrayList<Employee> list=new ArrayList<>();
        
       for(int i=0;i<n;i++){
           System.out.println("Enter Employee code : ");
           String Employee_code=reader.next();
           reader.nextLine();
           System.out.println("Enter Employee name : ");
           String Employee_name=reader.nextLine();
           System.out.println("Enter years of service : ");
           int yearOfService=reader.nextInt();
            System.out.println("Enter salary coefficient: ");
           double coefficient=reader.nextDouble();
           System.out.println("Enter the basic salary : ");
           double basicSalary=reader.nextInt();
           list.add(new Employee(Employee_code, Employee_name, yearOfService, coefficient, basicSalary));
       }
     
    }
    public void printHighestSalary(ArrayList<Employee> list){
        sort(list);
        list.get(0).print();
    }
    public void sort(ArrayList<Employee> list){
         Collections.sort(list, (s1 , s2)->{
          return (int)(s2.salary-s1.salary);
      });
    }
}
