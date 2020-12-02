public class Test {
    public void showShape(Shape s){ 
        System.out.println(""+s.toString()); 
        if(s instanceof Circle){ 
            System.out.println("Ini Bangun Datar Lingkaran"); 
            System.out.printf("Luas = %.2f%n", s.getArea());
            System.out.println("Keliling = "+s.getPerimeter());
        }
        else if(s instanceof Rectangle){
            System.out.println("Ini Bangun Datar Segi Empat"); 
            System.out.printf("Luas = %.2f%n", s.getArea());
            System.out.println("Keliling = "+s.getPerimeter());
        }
        else if(s instanceof Square){
            System.out.println("Ini Bangun Datar Segi Empat"); 
            System.out.printf("Luas = %.2f%n", s.getArea());
            System.out.println("Keliling = "+s.getPerimeter());
        }
    }   
}