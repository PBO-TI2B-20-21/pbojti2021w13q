/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author USER
 */
public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        width=3.14;
        length=5;
    }

    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
    super(color,filled);
    this.width=width;
    this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width *length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width=length);
    }
     public String toString() {
        return String.format("Rectangle lebar = %f &  panjang = %f,  subclass dari %s"
                            , width, length,super.toString());
    }
}
