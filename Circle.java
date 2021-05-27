/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11runner;

/**
 *
 * @author Miche
 */
public class Circle implements GeometricShape 
{
    private double a;
    public Circle() 
    {
        this.a = 0;
    }
    public Circle(double radius) 
    {
        this.a = radius;
    }
    @Override
    public double area() 
    {
        return this.a*this.a*3.14;
    }
}

