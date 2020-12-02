package pbokuis2;
public class Circle extends Shape {
    protected double radius;
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    @Override
    public String toString(){
        return "Shape[color = "+ color+","+"filled = "+filled+"]";
    }
}
