package aula.PBO_Kuis2;

/**
 *
 * @author Aulafz
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("*******************");
        System.out.println("Circle");
        System.out.println("*******************");
        Circle c1 = new Circle(10, "Black", true);
        System.out.println(c1);

        System.out.println("*******************");
        System.out.println("Rectangle");
        System.out.println("*******************");
        Rectangle r1 = new Rectangle(5, 4, "Blue", true);
        System.out.println(r1);

        System.out.println("*******************");
        System.out.println("Square");
        System.out.println("*******************");
        Square s1 = new Square(5, "None", false);
        Rectangle r2 = s1; //proses upcasting
        System.out.println(r2);
    }
}
