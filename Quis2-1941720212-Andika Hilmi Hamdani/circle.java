/**
 * circle
 */
public class circle extends shape{

    protected double radius;
    public circle(){

    }
    public circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getArea() {
        double area = 3.14 *radius *radius;
        return area;
    }
    @Override
    public double getPerimeter() {
        double perimeter = 3.14  * 2 *(radius);
        return perimeter;
    }
    public String toString(){
        return "Circle (color ="+getColor()+","+"filled "+isiFilled()+ ","+" radius=" + radius + "," + " Area "+getArea()+ "," +" perimeter "+getPerimeter()+")";
    }
}