/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author ASUS
 */
public abstract class shape{
    protected String color;
    protected boolean filled;

    public shape(){

    }
    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public boolean isiFilled(){
        return true;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape (color ="+color+","+"filled "+filled+")";
    }
}