
package kuis2;
/**
 * BimaGilangL
 */
public class Circle extends Shape {
    
    protected double radius;
    public Circle(){
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getPerimeter() {
        return 2*radius*Math.PI;
    }
  //public String toString(){
  
  //}
    
}
