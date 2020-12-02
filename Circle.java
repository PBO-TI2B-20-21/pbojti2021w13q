public class Circle extends Shape {

    protected double radius;
    public Circle() {
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius=radius;
        this.color=color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
      this.radius=radius;
    }
    public double getArea() {
        double area = 3.14 *radius *radius;
        return area;
    }
    public double getPerimeter() {
        double area = 3.14 *radius *radius;
        return perimeter;
    public String toString() {
        return "";
    }

}