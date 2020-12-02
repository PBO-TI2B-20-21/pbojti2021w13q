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
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(){
        this.length=3.0;
        this.width=3.0;
    }
    
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        this.color=color;
        this.filled=filled;
        this.length=length;
        this.width=width;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width=width;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setLength(double length){
        this.length=length;
    }
    
    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getParimeter() {
        return 2*length+2*width;
    }
    
    @Override
    public String toString(){
        return "Rectangle[Shape" + "[color= " + getColor() + "," + "filled= " + isFilled() + "]," + "width= " + width + "," + "length= " + length + "]";
    }
}
