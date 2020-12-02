package Kuis2PBO;

/**
 *
 * @author dhimas
 */
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    
    public Rectangle(){}
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        String data = "Rectangle"+"\n"+
                "Filled\t: "+super.isFilled()+"\n"+
                "Color\t: "+super.color+"\n"+
                "Width\t: "+width+"\n"+
                "Length\t: "+length+"\n"+
                "Area\t: "+getArea()+"\n"+
                "Perimeter: "+getPerimeter()+"\n";
        return data;
    }
}
