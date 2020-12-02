/**
 * test
 */
public class test {

    public static void main(String[] args) {
        // circle
        circle c1 = new circle(2,"red",true);
        shape s1 = c1;
        System.out.println(s1.toString());
        System.out.println();
        // rectangle
        rectangle r1 = new rectangle(2,4,"blue",true);
        shape s2 = r1;
        System.out.println(s2.toString());
        System.out.println();
        // square
        square s3 = new square(4,"green",true);
        rectangle r2 = s3;
        System.out.println(r2.toString());
    }
}