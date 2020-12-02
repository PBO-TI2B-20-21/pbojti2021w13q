public class Square extends Rectangle {
    private double side;
    public Square() {
        
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);  
    }
    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side) {
        super.width = side;
    }
    @Override
    public void setLength(double side) {
        super.length = side;
    }
    @Override
    public String toString() {
        return "Square[Rectangle" + "[" + "Shape" + "(" + "color=" + getColor() + 
                "," + "filled=" + getFilled() + ")," + "width=" + getWidth() + "," + "length=" + getLength() + "]";
    }
}