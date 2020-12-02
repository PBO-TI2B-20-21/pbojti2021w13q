package com.gisanda;

public class Circle extends Shape {
    double radius;

    public Circle() {
    }

    @Override
    public String toString() {
            return "Circle with Color: " + color + " and filled " + filled;
    }

    public Circle (double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        float pi = (float) 3.14;
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        float pi = (float) 3.14;
        return pi * Math.pow(radius, 2);
    }


}