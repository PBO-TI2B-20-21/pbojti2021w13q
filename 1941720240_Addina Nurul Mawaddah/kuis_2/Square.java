package kuis_2;

public class Square extends Rectangle{
    protected double side;

    public Square(double side) {
        this.side = side;
    }
    
    public Square(double side, double width, double lenght) {
        super(width, lenght);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
    public String toString() {
        String info = "\n Data Square =";
        info += "\n Area = "+2* side+"\n" ; 
        return info;
    }
    
}
