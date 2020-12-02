/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author DEBORA
 */
public class Rectangle extends Shape {
    protected  double width;
    protected  double length;

    public Rectangle() {
       
    }
    public Rectangle(double width, double length) {
        super();
        this.width  = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width  = width;
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
    @Override
     public String toString() {
        String data = 
                "RECTANGLE"+"\n"+         
                "Color : "+super.color+"\n"+
                "Filled : "+super.isiFilled()+"\n"+
                "Width : "+width+"\n"+
                "Length : "+length+"\n"+
                "Area : "+getArea()+"\n"+
                "Perimeter : "+getPerimeter();
        System.out.println("");
        return data;
    }
}
