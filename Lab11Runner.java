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
public class Lab11Runner {
    public static void main(String[] args) 
    {
        Circle cir = new Circle(5);
        Rectangle rect = new Rectangle(4,5);
        Triangle tri = new Triangle(2,3);
        GeometricShape[] shape= {cir,rect,tri};
        double [] AREA1 = calculateAreas(shape);
        System.out.println("Area of Circle,Rectangle and Triangle respectively");
        for (int i = 0; i<shape.length;i++)
        {
            System.out.println(AREA1[i]);
        }
    }
    public static double[] calculateAreas(GeometricShape[] shape) 
    {
        double[] AREA= new double[shape.length];
        for(int i=0;i<shape.length;i++) 
        {
            AREA[i]=shape[i].area();
        }
        return AREA;
    }
}
