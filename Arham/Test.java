public class Test  {
    public void hitung(Shape s) {
        if (s instanceof Circle) {
            Circle eb = (Circle) s;
            System.out.println("----------------lingkaran-------------");
            System.out.println(""+eb.getToString());
        } 
        else if (s instanceof Rectangle){
            Rectangle pe = (Rectangle) s;
            System.out.println("----------------Segi Empat-------------");
            System.out.println(""+pe.getToString());}
        } 

        public void kotak(Rectangle e) {
            System.out.println("DIBAWah INI ADALAH UNTUK MENGECEK APAKAH PERSEGI PANJANG ATAU PERSEGI");
        if (e instanceof Square) {
            System.out.println("Ini adalah Persegi karena lebar=" + e.width+"panjang ="+e.length);

        } else {
            System.out.println("Ini bukan persegi karena lebar=" + e.width+"panjang ="+e.length);
        }
    }
}
