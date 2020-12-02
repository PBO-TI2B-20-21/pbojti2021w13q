package com.gisanda;

public class Test {
    public static void main(String[] args) {
        System.out.println("------------------Rectangle-------------------");
        double width = 5, length = 7;
        String color = "red";
        Boolean filled = false;
        Shape rectangle = new Rectangle(width, length,color,filled);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.getArea()
                + "\nResulting perimeter: " + rectangle.getPerimeter() + "\n" + rectangle.toString());

        System.out.println("--------------------Circle--------------------");
        double radius = 5;
        Shape circle = new Circle(radius,color,filled);
        System.out.println("Circle radius: " + radius
                + "\nResulting Area: " + circle.getArea()
                + "\nResulting Perimeter: " + circle.getPerimeter() + "\n" +circle.toString());

        System.out.println("--------------------Square--------------------");
        double side = 5;
        Shape square = new Square(side,color,filled);
        System.out.println("Square sides lengths: "+ side
                + "\nResulting Area: " + square.getArea()
                + "\nResulting Perimeter: " + square.getPerimeter() + "\n"+square.toString());
    }
}