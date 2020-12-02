/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INDRAFN
 */
public class Square extends Rectangle{
    protected double side;
    
    public Square(){
        super();
        this.side = side;
    }
    
    public Square(double side){
        super(side, side);
    }
    
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    
    public double getSide(){
        return getSide();
    }
    
    public void setSide(double side){
        this.setSide(side);
    }
    
    @Override
    public void setWidth(double side){
        this.setWidth(getWidth());
    }
    
    public void setLength(double side){
        this.setLength(getLength());
    }
    
    @Override
    public String toString(){
        return "Square(Shape " + "(Color = " + getColor() + 
                ", " + "illed = " + isFilled() + "), " + 
                "Width = " + width + ", " + "Length = " + 
                length + ")";
    }
}
