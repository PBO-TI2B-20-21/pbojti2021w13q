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
public class Main_Shape {
    public static void main(String[] args) {
                Shape shape1 = new Circle(3.14, "GREY", true);  
                System.out.println(shape1);                    
                System.out.println("memiliki warna = "+shape1.getColor());
                System.out.println("memiliki area = "+shape1.getArea());          
                System.out.println("memiliki perimeter = "+shape1.getPerimeter());     
                System.out.println("\n");

    }
    
}
