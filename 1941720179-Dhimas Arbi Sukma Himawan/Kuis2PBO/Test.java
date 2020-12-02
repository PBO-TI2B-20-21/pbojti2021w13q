package Kuis2PBO;

/**
 *
 * @author dhimas
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(7,"red",true);
        Rectangle rectangle = new Rectangle(5,10,"green",true);
        Square square = new Square(5,"blue",true);
        
        Shape c = circle;
        Shape r = rectangle;
        Shape s = square;
        
        System.out.println(""+c.toString());
        System.out.println(""+r.toString());
        System.out.println(""+s.toString());
        
//        Circle c2 = (Circle) c;
//        Rectangle r2 = (Rectangle) r;
//        Square s2 = (Square) s;
//        
//        System.out.println(""+c2.toString());
//        System.out.println(""+r2.toString());
//        System.out.println(""+s2.toString());
    }
}
