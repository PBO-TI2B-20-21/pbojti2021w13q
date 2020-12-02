public class Square extends Rectangle{
    protected double side;
    
    public Square(){

    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super.length = side;
        this.width = side;
        super.color = color;
        super.filled = filled;
        
    }
    
    @Override
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public void setLength(double length){
        this.length = length;
    }
    
    @Override
    public String toString() {
        String data = "Rectangle"+"\n"+
                "Filled\t: "+super.isFilled()+"\n"+
                "Color\t: "+super.color+"\n"+
                "Side\t: "+side+"\n"+
                "Area\t: "+super.getArea()+"\n"+
                "Perimeter: "+super.getPerimeter()+"\n";
        return data;
    }
}
