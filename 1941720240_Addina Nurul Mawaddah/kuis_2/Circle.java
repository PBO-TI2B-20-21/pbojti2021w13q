package kuis_2;

public class Circle extends Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double phi =3.14;
        return phi * radius * radius;
    }

    @Override
    public double getPerimeter() {
        double d = 2* radius;
        double phi =3.14;
        return phi *d;
    }
    
    public String toString() {
        String info = "\n Data Circle =";
        info +=  super.toString() + "\n Perimeter = "+getPerimeter()+"\n Area = "+getArea()+"\n" ;
        return info;
    }
}
