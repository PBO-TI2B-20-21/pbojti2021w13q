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
public class Square extends Rectangle{
    public Square(){
        this.color=color;
        this.filled=filled;
    }
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side);
        this.color=color;
        this.filled=filled;
    }
    
    public double getSide(){
        return this.getSide();
    }
    
    public void setSide(double side){
        this.setSide(side);
    }
    
    @Override
    public void setWidth(double side){
        this.setWidth(getWidth());
    }
    
    @Override
    public void setLength(double side){
        this.setLength(getLength());
    }
    
    @Override
    public String toString(){
        return this.color;
    }
}
