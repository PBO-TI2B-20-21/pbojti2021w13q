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
public abstract class Shape {
    private String colour;
    private boolean filled;
    
    public Shape(){
        
    }
    public Shape(String colour,boolean filled){
        this.colour = colour;
        this.filled = filled;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour ){
        this.colour = colour;
    }
    public boolean isiFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public abstract double getArea();
    
    public abstract double getParimeter();
}
