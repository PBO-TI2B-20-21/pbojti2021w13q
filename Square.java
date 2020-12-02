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
public class Square extends Rectangle {
    protected double side; 
    public Square() {
        
    }
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super.length = side;
        this.width = side;
        super.color = color;
        super.filled = filled;
//        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString() {
                String data = 
                "SQUARE"+"\n"+
                "Color : "+super.color+"\n"+
                "Filled : "+super.isiFilled()+"\n"+         
                "Side : "+side+"\n"+
                "Area : "+super.getArea()+"\n"+
                "Perimeter: "+super.getPerimeter();
                System.out.println("");
        return data;
    }
}
