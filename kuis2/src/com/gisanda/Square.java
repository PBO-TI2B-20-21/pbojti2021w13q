package com.gisanda;

public class Square extends Shape {
     double side;

    public Square(){
    }

    public Square(double side)
    {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public double getPerimeter()
    {
        return(side*4) ;

    }
    @Override
    public String toString() {
        return "A square with side "+side;
    }

    @Override
    public double getArea() {
        return (side*side);
    }
}