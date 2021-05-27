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
public class Triangle implements GeometricShape
{
    private double a;
    private double b;
    public Triangle() 
    {
        this.a = 0;
        this.b = 0;
    }
    public Triangle(double base, double height) {
        this.a = base;
        this.b = height;
    }
    @Override
    public double area()
    {
        return 0.5*this.a*this.b;
    }
}
