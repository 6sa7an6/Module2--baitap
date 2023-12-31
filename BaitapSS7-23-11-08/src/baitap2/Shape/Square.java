package baitap2.Shape;

import baitap2.Implement.Colorable;

public class Square extends Shape implements Colorable {
    public Square() {
    }

    @Override
    public void howToColor() {
        System.out.println("Color All four sides");
    };

    public Square(double w, double h) {
        super(w, h);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String dienTich() {
        return "Square " + getW()*getH();
    }
}
