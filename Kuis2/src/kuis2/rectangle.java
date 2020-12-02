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
public class rectangle extends shape{

    protected double width;
    protected double length;

    rectangle() {

    }

    rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled =filled;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    @Override
    public double getArea() {
        double areaRectangle = width * length;
        return areaRectangle;
    }
    @Override
    public double getPerimeter() {
        double perimeterRectangle = 2 * (width+length );
        return perimeterRectangle;
    }
    public String toString(){
        return "Rectangle (color ="+getColor()+","+"filled "+isiFilled()+ "," +" width=" + width + "," + "length=" + length + "," +" Area=" + getArea()+"," +" Perimeter =" + getPerimeter()+")";
    }
}