/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INDRAFN
 */
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    
    public Rectangle(){
        this.length = 3;
        this.width = 3;
    }
    
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = filled;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getParameter() {
        return 2 * length * width;
    }
    
    @Override
    public String toString(){
        return "Rectangle(Shape " + "(Color = " + getColor() +
               ", " + "illed = " + isFilled() + "), " + 
                "Width = " + width + ", " + "Length = " + 
                length + ")";
    }
}
