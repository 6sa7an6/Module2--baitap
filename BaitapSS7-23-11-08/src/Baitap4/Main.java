package Baitap4;

import Baitap4.Shape.Circle;
import Baitap4.Shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red" , 5);
        Rectangle rectangle = new Rectangle("blue" , 5 , 9);
        System.out.println("Dien tich hinh tron" + circle.getArea());
        System.out.println("Dien tich hinh chu nhat " + rectangle.getArea());
    }
}
