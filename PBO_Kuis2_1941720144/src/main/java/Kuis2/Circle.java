/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author Zidan
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(){
        this.radius=3.0;
    }
    
    public Circle(double radius){
        this.radius=radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getParimeter() {
        return  2*Math.PI*radius;
    }
    
    @Override
    public String toString(){
        return "Circle[Shape" + "[color= " + getColor() + "," + "filled= " + isFilled() + "]," + "radius= " + radius + "]";
    }
}
