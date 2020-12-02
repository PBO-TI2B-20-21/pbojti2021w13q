/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author DEBORA
 */
public class Circle extends Shape {
    protected double radius;

    public Circle() {       
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
    @Override
    public double getPerimeter() {
         return 2*3.14*radius;
    }
    @Override
    public String toString() {
        String data = 
                "CIRCLE"+"\n"+ 
                "Color : "+super.color+"\n"+
                "Filled : "+super.isiFilled()+"\n"+
                "Radius : "+radius+"\n"+
                "Area : "+getArea()+"\n"+
                "Perimeter : "+getPerimeter();
                System.out.println("");
        return data;
//        return String.format("Circle dengan radius = %f, adalah subclass dari %s"
//                            , radius, super.toString());
    }
}
