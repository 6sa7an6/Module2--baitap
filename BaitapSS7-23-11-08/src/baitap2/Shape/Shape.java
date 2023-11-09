package baitap2.Shape;

public abstract class Shape {
    private double w = 1.0;
    private double h = 1.0;
    public Shape() {
    }

    public Shape(double w, double h) {
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

    public abstract String dienTich();
}
