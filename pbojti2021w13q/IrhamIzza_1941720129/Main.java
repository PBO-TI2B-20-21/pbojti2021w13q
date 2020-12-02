public class Main {
   public static void main(String[] args) {
    /* Circle class */
    Circle c1 = new Circle();   
    c1.setColor("pink");  // superclass
    c1.setFilled(true);     // superclass
    c1.setRadius(5);
    System.out.println(c1);
    System.out.println("Color : " + c1.getColor());  // superclass
    System.out.println("Filled : " + c1.getFilled()); // superclass
    System.out.println("Radius : " + c1.getRadius());
    System.out.printf("Area : %.2f%n", c1.getArea());
    System.out.printf("Perimeter : %.2f%n", c1.getPerimeter());
    System.out.println("");
    /* Rectangle class */
    Rectangle r1 = new Rectangle();
    r1.setWidth(3.5);
    r1.setLength(8.1);
    r1.setColor("blue");  // superclass
    r1.setFilled(true);     // superclass
    System.out.println(r1);
    System.out.println("Color : " + r1.getColor());  // superclass
    System.out.println("Filled : " + r1.getFilled()); // superclass
    System.out.println("Length : " + r1.getLength());
    System.out.println("Width : " + r1.getWidth());
    System.out.printf("Area : %.2f%n", r1.getArea());
    System.out.printf("Perimeter : %.2f%n", r1.getPerimeter());
    System.out.println("");
    /* Square class */
    Square sq1 = new Square();
    sq1.setSide(3.3);
    sq1.setColor("orange");  // superclass
    sq1.setFilled(false);    // superclass
    System.out.println(sq1);
    System.out.println("Color : " + sq1.getColor());   // superclass
    System.out.println("Filled : " + sq1.getFilled());  // superclass
    System.out.println("Side : " + sq1.getSide());
    System.out.printf("Area is: %.2f%n", sq1.getArea());
    sq1.setWidth(4.4);  // overridden
    System.out.println(sq1);
    System.out.println("Width : " + sq1.getWidth());   // superclass
    sq1.setLength(5.5);  // overridden
    System.out.println(sq1);
    System.out.println("Length : " + sq1.getLength()); // superclass
    System.out.printf("Area is: %.2f%n", sq1.getArea());
    System.out.printf("Perimeter is: %.2f%n", sq1.getPerimeter());
    System.out.println("");
    
    System.out.println("CASTING");
    //CASTING
    Test t = new Test(); 
    t.showShape(c1);//show Circle
    System.out.println("------------------"); 
    t.showShape(r1);//show Rectangle 
    System.out.println("------------------"); 
    t.showShape(sq1);//show Rectangle 
  }
}