public class Circle extends Shape {
    
    protected double radius;
    public Circle() {
        
    }
    public Circle(double radius, String color, Boolean filled) {
        super(color,filled);
        this.radius=radius;
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String getToString() {
        String info = super.getToString()+"\n";
        info += "Radius"+radius +"\n luas"+this.getArea()+"\n luas"+getPerimeter();
        return info;
    }
}
