/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author Risky
 */
public class Test {

    public static void main(String[] args) {
        //Circle
        Shape s1 = new Circle(1.5, "Grey", false);
        System.out.println("Area : " + s1.getArea());
        System.out.println("Parimeter : " +s1.getParimeter()); 
        System.out.println("Colour : " + s1.getColour());
        System.out.println(s1.isiFilled());
        
    }    
}
