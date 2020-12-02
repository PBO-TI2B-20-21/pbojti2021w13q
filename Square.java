package com.company;

public class Square extends Rectangle {

    public Square(){
    }

    public Square(double side){
        super(side, side);
    }
    public Square (double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getSide();
    }
    public void setSide (double side){
        this.setSide(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
