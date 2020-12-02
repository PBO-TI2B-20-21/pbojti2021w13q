package com.company;

public class Circle extends Shape {

    protected double radius;

    public Circle(){
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        double luas = radius * radius * Math.PI;
        return luas;
    }

    @Override
    public double getPerimeter() {
        double keliling = 2 * Math.PI * radius;
        return keliling;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
