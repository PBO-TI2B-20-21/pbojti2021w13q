/**
 * shape
 */
public abstract class Shape {
    protected String color;
    protected Boolean filled = true;
    
    public Shape() {
        
    }

    public Shape(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isiFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String getToString() {
        return "color ="+color;
    }
}