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
public class Rectangle implements GeometricShape{
    private double a;
    private double b;
    public Rectangle() 
    {
        this.a = 0;
        this.b = 0;
    }
    public Rectangle(double length, double width) 
    {
        this.a = length;
        this.b = width;
    }
    @Override
    public double area() 
    {
        return this.a*this.b;
    }
}
