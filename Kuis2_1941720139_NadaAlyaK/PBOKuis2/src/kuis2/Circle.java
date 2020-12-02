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
public class Circle extends Shape {

    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * 3.14 * radius);
    }

    @Override
    public String toString() {
        return "CIRCLE : \n-Shape-\n" + "Color : " + getColor() + "\nFilled  : " 
        + isFilled() + "\nRadius : " + getRadius() + "\nArea : " + getArea() +
        "\nPerimeter : " + getPerimeter();
    }
}
