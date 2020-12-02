public abstract class shape{
    protected String color;
    protected boolean filled;

    public shape(){

    }
    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public boolean isiFilled(){
        return true;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape (color ="+color+","+"filled "+filled+")";
    }
}