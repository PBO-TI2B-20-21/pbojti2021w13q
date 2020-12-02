
package kuis2;
/**
 * BimaGilangLesmana
 */
public class Squere extends Rectangle {
    private double side;
    public Squere(){    
    }
    public Squere(double side){
        super(side, side);
    }
    public Squere(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return this.side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setWidth(double side){
        super.setWidth(width);
    }
    public void setLength(double side){
        super.setLength(length);
    }
  //public String toString(){
  
  // }
}
