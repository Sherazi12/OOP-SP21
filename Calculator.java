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
public class Calculator 
{
    private static double num1;
    private static double num2;
    
    Calculator()
    {
        num1=10;
        num2=10;
    }
    Calculator(double a,double b)
    {
        num1=a;
        num2=b;
    }
    public static void setA(double a)
    {
        num1=a;
    }
    public static double getA()
    {
        return num1;
    }
    public static void setB(double b)
    {
        num2=b;
    }
    public static double getB()
    {
        return num2;
    }
    public static void sum()
    {
        double sum;
        sum=num1+num2;
        System.out.println("SUM : "+sum);
    }
    public static void multiply()
    {
        double multiply;
        multiply=num1*num2;
        System.out.println("MULTIPLY : "+multiply);
    }
    public static void divide()
    {
        double divide;
        divide=num1/num2;
        System.out.println("DIVIDE : "+divide);
    }
    public static void mod()
    {
        double mod;
        mod=num1%num2;
        System.out.println("MODULUS : "+mod);
    }
    public static void sin()
    {
        double sin;
        double rad = Math.toRadians(num2);
        sin=Math.sin(rad);
        System.out.println("SIN : "+sin);
    }
    public static void cos()
    {
        double cos;
        double rad = Math.toRadians(num2);
        cos=Math.cos(rad);
        System.out.println("COS : "+cos);
    }
    public static void tan()
    {
        double tan;
        double rad = Math.toRadians(num2);
        tan=Math.tan(rad);
        System.out.println("TAN : "+tan);
    }   
}