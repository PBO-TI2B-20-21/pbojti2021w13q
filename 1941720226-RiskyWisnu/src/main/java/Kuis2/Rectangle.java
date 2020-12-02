/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author Risky
 */
public class Rectangle extends Shape {
    private double width;
    private double length;
    
    public Rectangle(){
        
    }
    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle (double width, double length,String colour,boolean filled){
        super (colour,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getParimeter() {
        return 2*length + 2*width;
    }
    
}
