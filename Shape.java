public abstract class shape{

    protected String color;
    protected boolean filled;

    public shape(){
        color ="red";
        filled = true;
    }
    public void Shape(String color, boolean filled) {
        this.color=color;
        this.filled=filled;
    }
    public String getColor() {
       return color;
    }
    public void setColor(String color) {
        this.color=color;
    }
    public boolean isFilled() {
        return true;
    }
    public void setFilled(boolean filled) {
       this.filled=filled;
    }
    public double getArea() {
        return 0.0d;
    }
    public double getPerimeter() {
        return 0.0d;
    }
    public String toString() {
        return "";
    }

}