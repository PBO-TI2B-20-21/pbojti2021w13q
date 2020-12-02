/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis2;

/**
 *
 * @author Zidan
 */
public class Main {
    public static void main(String[] args) {
        
        Circle crl = new Circle();
        System.out.println(crl);
        crl.setColor("blue"); 
        crl.setFilled(true);     
        crl.setRadius(5.0);
        System.out.println(crl);
        System.out.println("Color= " + crl.getColor());  
        System.out.println("Filled= " + crl.isFilled()); 
        System.out.println("Radius= " + crl.getRadius());
        System.out.printf("Area= %.2f%n", crl.getArea());
        System.out.printf("Parimeter= %.2f%n", crl.getParimeter());

  
        Rectangle rct = new Rectangle();
        System.out.println(rct);
        rct.setWidth(3.0);
        rct.setLength(5.0);
        rct.setColor("white");  
        rct.setFilled(true);     
        System.out.println(rct);
        System.out.println("Color= " + rct.getColor()); 
        System.out.println("Filled= " + rct.isFilled()); 
        System.out.println("Length= " + rct.getLength());
        System.out.println("Width= " + rct.getWidth());
        System.out.printf("Area= %.2f%n", rct.getArea());
        System.out.printf("Parimeter=: %.2f%n", rct.getParimeter());
  }
}
