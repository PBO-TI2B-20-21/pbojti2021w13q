public class Square extends Rectangle{
    private double side;

    public Square() {
        super();
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

    public void setWidth(double side) {
        super.setWidth(getWidth());
    }

    public void setLength(double side) {
        super.setLength(getLength());
    }

    public String toString() {
        return "SQARE SHAPE " + "width=" + getWidth() + "," + "length=" + getLength() + "";
    }

}
