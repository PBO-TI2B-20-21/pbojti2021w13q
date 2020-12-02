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
public abstract class Shape {
    public String color;
    public boolean filled;
    public String toString;
    public double area;
    public double Perimeter;
    
    public Shape(){
        
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setfilled(boolean filled){
        this.filled=filled;
    }
    public boolean getFilled(){
        return filled;
    }
    public abstract void tostring();
}
