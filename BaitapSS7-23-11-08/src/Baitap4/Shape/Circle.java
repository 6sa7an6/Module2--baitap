package Baitap4.Shape;

public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
