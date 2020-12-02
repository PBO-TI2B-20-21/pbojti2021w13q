/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INDRAFN
 */
public class MainClass {
    public static void main(String[] args) {
        Circle c = new Circle(3, "Yellow", true);
        System.out.println("============== CIRCLE ==============");
        System.out.println(c.toString());
        System.out.println("Filled\t\t: " + c.filled);
        System.out.println("Color\t\t: " + c.getColor());
        System.out.println("Area\t\t: " + c.getArea());
        System.out.println("Parameter\t: " + c.getParameter());
        
        Rectangle r = new Rectangle(4,8,"Blue", true);
        System.out.println("============== RECTANGLE ==============");
        System.out.println(r.toString());
        System.out.println("Filled\t\t: " + r.filled);
        System.out.println("Color\t\t: " + r.getColor());
        System.out.println("Area\t\t: " + r.getArea());
        System.out.println("Parameter\t: " + r.getParameter());
    }
}
