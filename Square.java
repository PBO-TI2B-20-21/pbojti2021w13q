public class Square extends Rectangle {

    public Square() {
    }
    public  Square(double side) {
        
    }
    public void Square(double side, String color, boolean filled) {
        super(side,color,filled);
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side=side;
    }
    public void setWidth(double side) {
        super.setWidth(width);
    }
    public void setLength(double side) {
       super.setLength(length);
    }
    public String toString() {
       
        return "";
    }

}