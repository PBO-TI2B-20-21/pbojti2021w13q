package kuis_2;

public class Test {
    public static void Cast(Shape shp){
        if(shp instanceof Circle){
            Circle cr = (Circle) shp;
            cr.toString();
        }else if (shp instanceof Rectangle){
            Rectangle rct = (Rectangle) shp;
            rct.toString();
        }
    }
    
    public static void main(String[] args) {
        Circle cr = new Circle(4, "blue", true);
        Rectangle rct = new Rectangle(6, 3, "merah", true);
        Square sq = new Square(4);
        Cast(rct);
        Cast(cr);
        
        
        System.out.println(""+cr.toString());
        System.out.println("-------------------------");
        System.out.println(""+rct.toString());
        rct.getArea();
        rct.getPerimeter();
        System.out.println("-------------------------");
        System.out.println(""+sq.toString());
        
    }
}
