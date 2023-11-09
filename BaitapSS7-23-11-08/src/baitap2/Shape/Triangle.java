package baitap2.Shape;

public class Triangle extends Shape{
    public Triangle(double w, double h) {
        super(w, h);
    }

    @Override
    public String dienTich() {
        return "Triangle " + getW()*getH()/2;
    }
}
