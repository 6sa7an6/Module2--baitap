package Baitap4.Shape;

public class Rectangle extends Shape{
    private double w,h;

    public Rectangle() {
    }

    public Rectangle(String color, double w, double h) {
        super(color);
        this.w = w;
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double getArea() {
        return w*h;
    }
}
