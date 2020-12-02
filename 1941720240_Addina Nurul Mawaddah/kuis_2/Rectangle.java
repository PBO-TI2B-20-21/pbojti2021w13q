package kuis_2;

public class Rectangle extends Shape{
    protected double width;
    protected double lenght;

    public Rectangle() {
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public double getPerimeter() {
        return (2*lenght)+(2*width);
    }
    
    public String toString() {
        String info = "\n Data Rectanggle =";
        info += super.toString() + "\n Perimeter = "+getPerimeter()+"\n Area = "+getArea()+"\n" ;
        return info;
    }
}
