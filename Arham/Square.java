public class Square extends Rectangle {
    protected double side;

    public Square() {   
    }
    public Square(double side) {
        this.side=side;
    }

    public Square(double side,String color,boolean filled, double width,double length) {
        super(width, length);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
    @Override
    public String getToString() {
        String info = super.getToString()+"\n";
        info += "lebar="+super.width+"panjang="+super.length;
        return info;
    }
}
