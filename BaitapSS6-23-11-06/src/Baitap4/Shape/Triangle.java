package Baitap4.Shape;

public class Triangle extends Shape{
    private String color;

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public Triangle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        double s = (getSide1()+getSide2()+getSide3())/2;
        return Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
    }
    public double getPerimeter(){
        return getSide1()+getSide2()+getSide3();
    }

    @Override
    public String toString() {
        return super.toString() + "{ Màu sắc là : " + color + ", Chu vi là : " + getPerimeter() + ", Diện tích là : " + getArea() + " }";
    }
}
