public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        
    }

    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }

    public Rectangle(double width, double length,String color,Boolean filled) {
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return (2*width)+(2*length);
    }

    @Override
    public String getToString() {
        String info = super.getToString()+"\n";
        info += "width"+width +"length"+length+"\n luas"+this.getArea()+"\n Keliling"+getPerimeter();
        return info;
    }
}
