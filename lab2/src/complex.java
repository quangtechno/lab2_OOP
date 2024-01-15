
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class complex {
    double re;
    double im;
    public complex(){
        
    }
    public complex(double re,double im){
     this.re=re;
     this.im=im;
    }
    public void input(){
        Scanner reader=new Scanner(System.in);
        System.out.println("input number re: ");
        re=reader.nextDouble();
        System.out.println("input number im: ");
        im=reader.nextDouble();
    }
    public void print(){
        System.out.println("add("+re+" , "+im+") result: " +add());
        System.out.println("minus("+re+" , "+im+") result: " +minus());
        System.out.println("multiply("+re+" , "+im+") result: " +multiply());
        System.out.println("divide("+re+" , "+im+") result: " +divide());
    }
    public double add(){
       return re+im;
    }
    public double minus(){
        return re-im;
    }
    public double multiply(){
        return re*im;
    }
    public double divide(){
        return re/im;
    }
}

