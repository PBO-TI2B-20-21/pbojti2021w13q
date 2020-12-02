package Kuis2PBO;

/**
 *
 * @author dhimas
 */
public class Circle extends Shape{
    protected double radius;
    
    public Circle(){    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
    @Override
    public String toString() {
        String data = "Circle"+"\n"+
                "Filled\t: "+super.isFilled()+"\n"+
                "Color\t: "+super.color+"\n"+
                "Radius\t: "+radius+"\n"+
                "Area\t: "+getArea()+"\n"+
                "Perimeter: "+getPerimeter()+"\n";
        return data;
    }
}
