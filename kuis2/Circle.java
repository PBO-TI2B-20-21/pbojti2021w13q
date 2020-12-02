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
class Circle extends Shape {
    protected double radius;
    public Circle(){
       
        radius=5;
    }
   public Circle(double radius){
       
       this.radius=radius;
   }
   public Circle(double radius, String color, boolean filled){
   super(color,filled);
   this.radius=radius;
   }
   public double getRadius(){
       return radius;
   }
   public void setRadius(double radius){
       this.radius=radius;
   }

    @Override
    public double getArea() {
    return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*radius * Math.PI;
    }
    @Override
   public String toString(){
        return String.format("Circle  berradius = %f,\nsubclas dari %s"
                            , radius, super.toString());
   }
}
