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
public abstract class Shape {
    public String color;
    public boolean filled;
    
    public Shape(){
        this.color="blue";
        this.filled=true;
    }
    
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    
    public abstract double getArea();
    
    public abstract double getParimeter();
    
    @Override
    public String toString(){
        return "Shape[color= " + color + " , " + "filled= " + filled + "]";
    }
}
