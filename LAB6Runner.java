/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6runner;

/**
 *
 * @author Miche
 */
import java.util.Scanner;
import java.lang.Math;
public class LAB6Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Calculator obj = new Calculator(5,2);
        Scanner Obj = new Scanner(System.in);
        System.out.println("Press 1 for sum");
        System.out.println("2 for multiply");
        System.out.println("3 for divide");
        System.out.println("4 for mod");
        System.out.println("5 for sin");
        System.out.println("6 for cos");
        System.out.println("7 for tan");
        int temp = Obj.nextInt();
        switch (temp) 
        {
            case 1:
              Calculator.sum();
              break;
            case 2:
              Calculator.multiply();
              break;
            case 3:
              Calculator.divide();
              break;
            case 4:
              Calculator.mod();
              break;
            case 5:
              Calculator.sin();
              break;
            case 6:
              Calculator.cos();
              break;
            case 7:
              Calculator.tan();
              break;
        }
    }
    
}
