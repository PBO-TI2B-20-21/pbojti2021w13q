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
public class Rectangle extends Shape{
    public double width;
    public double length;
    
    public Rectangle(){
        
    }
    public Rectangle(double radius){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public void setWidth(){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    @Override
    public void tostring(){
        System.out.println("===================================== ");
        System.out.println("-------------Rectangle-------------");
        System.out.println("Color \t: "+this.getColor());
        System.out.println("Filled \t: "+this.getFilled());
        System.out.println("Width \t: "+this.getWidth()); 
        System.out.println("Length \t: "+this.getLength());
        System.out.println("Luas \t: "+this.length*this.width);
        System.out.println("Keliling: "+2*(this.length+this.width));
    }
}
