/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INDRAFN
 */
public class Circle extends Shape{
    protected double radius;
    
    public Circle(){
        this.radius = 3;
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getParameter() {
        return 2 * 3.14 * radius;
    }
    
    @Override
    public String toString(){
        return "Circle(Shape " + "(Color = " + getColor() + 
                ", " + "illed = " + isFilled() + "), " + 
                "Radius = " + radius + ")";
    }
}
