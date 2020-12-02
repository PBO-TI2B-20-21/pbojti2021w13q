/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author WINDOWS 10
 */
public class Circle extends Shape {
    public double radius;
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public void setRadius(){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public void tostring(){
        System.out.println("-------------Circle-------------");
        System.out.println("Color \t: "+this.getColor());
        System.out.println("Filled \t: "+this.getFilled());
        System.out.println("Radius \t: "+this.getRadius());
        System.out.println("Luas \t: "+0.5*3.14*this.getRadius()*this.getRadius());  
        System.out.println("Keliling: "+2*3.14*this.getRadius());
    }
}
