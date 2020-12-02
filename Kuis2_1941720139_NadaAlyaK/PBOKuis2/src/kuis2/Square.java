/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Nada Alya
 */
public class Square extends Rectangle {

    protected double side;

    public Square() {
    }

    public Square(double side) {
    }

    public Square(double side, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return (4 * side);
    }

    @Override
    public String toString() {
        return "SQUARE :\n-Shape-\n" + "Color : " + getColor() + "\nFilled : " 
        + isFilled() + "\nArea : " + getArea() + "\nPerimeter : " 
        + getPerimeter();
    }
}
