package Baitap1;

import Baitap1.Circle.Circle;
import Baitap1.Circle.Cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"Red");
        Cylinder cylinder = new Cylinder(3,"bue",10);
        System.out.println("circle" + circle);
        System.out.println("cylinder" + cylinder);
    }
}
