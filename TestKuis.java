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
public class TestKuis {
    public static void main(String[] args) {
    Circle c = new Circle(14,"YELLOW",true);
    Rectangle r = new Rectangle(10,20,"PINK",true);
    Square s = new Square(10,"PURPLE",true);

    Shape circle = c;
    Shape rectangle = r;
    Shape square = s;

        System.out.println(""+c.toString());
        System.out.println(""+r.toString());
        System.out.println(""+s.toString());
    }    
}
   
