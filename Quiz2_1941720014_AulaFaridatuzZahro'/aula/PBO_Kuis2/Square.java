package aula.PBO_Kuis2;

/**
 *
 * @author Aulafz
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getSide();
    }

    public void setSide(double side) {
        this.setSide(side);
    }

    @Override
    public void setWidth(double side) {
        this.setWidth(getWidth());
    }

    @Override
    public void setLength(double side) {
        this.setLength(getLength());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
