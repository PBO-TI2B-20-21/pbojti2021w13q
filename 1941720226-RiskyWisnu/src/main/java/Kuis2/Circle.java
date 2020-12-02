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
public class Circle extends Shape {
    private double radius;
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle (double radius , String colour , boolean filled){
        super(colour,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
     public void setRadius(double radius){
        this.radius = radius;
     }
    @Override
    public double getArea() {
        return radius * radius * Math.PI; 
    }
        
    @Override
    public double getParimeter() {
        return 2 * Math.PI * radius;
    }
    
}
