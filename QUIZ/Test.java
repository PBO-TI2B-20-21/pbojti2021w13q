
package QUIZ;

public class Test {
    public static void main(String[] args) {
        
        Shape shape1 = new Circle(5.5, "RED", true);  // Upcast Circle ke Shape
        System.out.println(shape1);                    
        System.out.println(shape1.getArea());          
        System.out.println(shape1.getPerimeter());     
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        System.out.println("\n");
           
        Circle circle1 = (Circle)shape1;              // Downcast back ke Circle
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());
        System.out.println("\n");
           
        Shape shape2 = new Rectangle(1.0, 2.0, "RED", true);   // Upcast
        System.out.println(shape2);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());
        System.out.println("\n");
        
        Rectangle rectangle1 = (Rectangle)shape2;     // downcast
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        System.out.println(rectangle1.getLength());
        System.out.println("\n");
           
        Shape shape3 = new Square(6.6);               // Upcast
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getColor());
        System.out.println("\n");

        Rectangle rectangle2 = (Rectangle)shape3;     //downcast
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getColor());
        System.out.println(rectangle2.getLength());
        System.out.println("\n");
           
        Square square1 = (Square)rectangle2;        //downcast rectangle2 ke square
        System.out.println(square1);
        System.out.println(square1.getArea());
        System.out.println(square1.getColor());
        System.out.println(square1.getSide());
        System.out.println(square1.getLength());

    }
}