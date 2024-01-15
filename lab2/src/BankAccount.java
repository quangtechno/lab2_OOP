
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class BankAccount {
    int mAccNum;
    String mName;
    double mBalance;
    public BankAccount(){
        
    }
    public BankAccount(int mAccNum,String mName,double mBalance){
        this.mAccNum=mAccNum;
        this.mName=mName;
        this.mBalance=mBalance;
    }

    public int getmAccNum() {
        return mAccNum;
    }

    public String getmName() {
        return mName;
    }

    public double getmBalance() {
        return mBalance;
    }
    public void deposit(double money){
        this.mBalance+=money;
    }
    public boolean withdraw(double money){
        if(money>mBalance){
            return false;
        }
        mBalance-=money;
        return true;
    }
    public boolean tranferMoney(BankAccount acc1,double money){
     if(this.withdraw(money)){
         acc1.deposit(money);
         return true;
     }
     return false;
    }
    public void print(){
        System.out.println(this.toString());
    }
    public String toString(){
        String temp="";
        temp+="account Number : "+mAccNum+"\n"+"Name : "+mName+"\n"+"balance : "+mBalance+"\n";
        return temp;
    }
}
