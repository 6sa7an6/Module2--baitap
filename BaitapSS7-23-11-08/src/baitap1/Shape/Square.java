package baitap1.Shape;

import baitap1.Resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    @Override
    public void resize(double percent) {
        double newSize = getWidth()*(percent+100)/100;
        setWidth(newSize);
    }

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
