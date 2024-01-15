
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class question2 {
    public static void main(String[] args){
        BankAccount acc1=new BankAccount(2031200058, "quang", 100);
        BankAccount acc2=new BankAccount(23124125, "tuan", 1000);
        acc1.tranferMoney(acc2, 100);
        acc1.print();
        acc2.print();
    }
  
    
}
