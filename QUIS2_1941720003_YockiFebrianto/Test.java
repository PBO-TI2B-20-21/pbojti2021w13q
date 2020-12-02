public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "red", true);
        Rectangle rectangle = new Rectangle(4, 8, "yellow", true);
        Square square = new Square(5, "blue", true);
        
        Shape c = circle;
        Shape r = rectangle;
        Shape s = square;
        
        System.out.println(""+c.toString());
        System.out.println(""+r.toString());
        System.out.println(""+s.toString());

    }
}
