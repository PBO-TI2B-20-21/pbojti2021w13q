/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author WINDOWS 10
 */
public class Square extends Rectangle{
    public double side;
    public Square(){
        
    }
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
     public void setSide(){
        this.side=side;
    }
    public double getSide(){
        return side;
    }
    public double getWidth(){
        return side;
    }
    public double getLength(){
        return side;
    }
    public void tostring(){
        System.out.println("===================================== ");
        System.out.println("-------------Square-------------");
        System.out.println("Color \t: "+this.getColor());
        System.out.println("Filled \t: "+this.getFilled());
        System.out.println("Side \t: "+this.getSide());
        System.out.println("Width \t: "+this.getWidth()); 
        System.out.println("Length \t: "+this.getLength());
        System.out.println("Luas \t: "+this.getSide()*this.getSide());
        System.out.println("Keliling: "+4*this.getSide());
        System.out.println("===================================== ");
    }
}
