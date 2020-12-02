import java.security.ProtectionDomain;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        if(color.equalsIgnoreCase("")){
            filled = false;
            color = "";
        }
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "";
    }
}
