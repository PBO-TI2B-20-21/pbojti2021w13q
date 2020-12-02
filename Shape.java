/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author DEBORA
 */
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {      
    }
    public Shape(String color, boolean filled) {
        this.color  = color;
        this.filled = filled;
    } 
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isiFilled(){
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    public String toString() {
        return "";
    }
}

