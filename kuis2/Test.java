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
public class Test {
    public static void main(String[] args) {
        Circle cr = new Circle(5, "red", true);
        cr.tostring();
        
        Rectangle rc = new Rectangle(4.5, 8.3, "yellow", true);
        rc.tostring();
        
        Square sq = new Square(4.5, "blue", true);
        sq.tostring();
    }   
}
