/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Nada Alya
 */
public class TestKuis {

    public static void main(String[] args) {
        //Shape sp = new Shape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        c.setColor("white"); 
        c.setFilled(true);     
        c.setRadius(7);
        c.getArea();
        c.getPerimeter();
        System.out.println(c.toString());

        r.setColor("blue");
        r.setFilled(true);
        r.setLength(5);
        r.setWidth(7);
        r.getArea();
        r.getPerimeter();
        System.out.println(r.toString());

        s.setColor("black");
        s.setFilled(true);
        s.setSide(5);
        s.getArea();
        s.getPerimeter();
        System.out.println(s.toString());
    }
}
