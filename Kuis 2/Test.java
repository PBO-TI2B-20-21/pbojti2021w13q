public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle(9.8,"RED", true);
        System.out.println(s1);
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());
        System.out.println("Area :" + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println();

        Shape s2 = new Rectangle(5.0, 8.0, "BLUE", true);
        System.out.println(s2);
        System.out.println("Color : " + s2.getColor());
        System.out.println("Filled : " + s2.isFilled());
        System.out.println("Area : " + s2.getArea());
        System.out.println("Parimeter : " + s2.getPerimeter());
        System.out.println();

        Shape s3 = new Square(4.4);
        System.out.println(s3);
        System.out.println("Color : " + s3.getColor());
        System.out.println("Filled : " + s3.isFilled());
        System.out.println("Area : " + s3.getArea());
        System.out.println("Parimeter : " + s3.getPerimeter());

    }
}
