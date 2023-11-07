package Baitap1.Circle;

public class Circle {
    private int r;
    private String color;
    private double dienTich;
    public Circle() {
    }

    public Circle(int r, String color) {
        this.r = r;
        this.color = color;
        this.dienTich = dienTich();
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double dienTich(){
        return r*r*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                ", dienTich=" + dienTich +
                '}';
    }
}
