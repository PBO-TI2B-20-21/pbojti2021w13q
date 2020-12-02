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
public class square extends rectangle{

    protected double side;

    square() {

    }
    square(double side, String color, boolean filled){
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public void setWidth(double width) {
        // TODO Auto-generated method stub
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        // TODO Auto-generated method stub
        super.setLength(length);
    }
    public String toString(){
        return "Square (color ="+getColor()+","+"filled "+isiFilled()+ " side="+side + "width=" + getWidth() + "," + "length=" + getLength() +  ")";
    }
}