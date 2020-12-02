public class Main {
    public static void main(String[] args) {
        Test tes = new Test();
        Circle cil = new Circle(10.0, "Biru", true);
        tes.hitung(cil);
        
        Rectangle wow = new Rectangle(2,5, "merah", true);
        tes.hitung(wow);

        Square sq = new Square();
        if (wow.width==wow.length) {
            tes.kotak(sq);
        } else {
            tes.kotak(wow);
        }   
    }
}
