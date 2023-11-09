package baitap2.run;

import baitap2.Implement.Colorable;
import baitap2.Shape.Shape;
import baitap2.Shape.Square;
import baitap2.Shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(5,7);
        shapes[1] = new Triangle(4,2);
        for(Shape shape : shapes){
            System.out.print(shape.dienTich());
            if(shape instanceof Square){
                Square colorable = (Square) shape;
                System.out.println(colorable.howToColor());
            }
        }
    }
}
