/**
 * square
 */
public class square extends rectangle{

    protected double side;

    square() {

    }
    square(double side, String color, boolean filled){
        this.side = side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    @Override
    public void setWidth(double width) {
        // TODO Auto-generated method stub
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        // TODO Auto-generated method stub
        super.setLength(length);
    }
    public String toString(){
        return "Square (color ="+getColor()+","+"filled "+isiFilled()+ " side="+side + "width=" + getWidth() + "," + "length=" + getLength() +  ")";
    }
}