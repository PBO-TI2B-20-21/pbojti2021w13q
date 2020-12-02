package pbokuis2;
public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.2,"blue",false);
        System.out.println(c1);
        System.out.println("Color   : "+c1.getColor());
        System.out.println("Filled  : "+c1.isFilled());
        System.out.println("Radius  : "+c1.getRadius());
        System.out.println("Area    : "+c1.getArea());
        System.out.println("Perimeter : "+c1.getPerimeter());
        
        Rectangle r1 = new Rectangle(2,1, "red", false);
        System.out.println(r1);
        System.out.println("Color   : "+r1.getColor());
        System.out.println("Filled  : "+r1.isFilled());
        System.out.println("Length  : "+r1.getLength());
        System.out.println("Width   : "+r1.getWidth());
        System.out.println("Area    : "+r1.getArea());
        System.out.println("Perimeter : "+r1.getPerimeter());
        
    }
}
