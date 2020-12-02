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
public class Square extends Rectangle {

    public Square() {
            
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getSide();
    }

    public void setSide(double side) {
        this.setSide(side);
    }

    public void setWidth(double side) {
        this.setWidth(getWidth());
    }

    public void setLength(double side) {
        this.setLength(getLength());
    }
}
