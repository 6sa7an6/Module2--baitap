package baitap1;

import baitap1.Resizeable.Resizeable;
import baitap1.Shape.Circle;
import baitap1.Shape.Rectangle;
import baitap1.Shape.Shape;
import baitap1.Shape.Square;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(3,6);
        for(int i = 0 ; i < shapes.length;i++){
            double resizeNumber = random.nextDouble()*100;
            if(shapes[i] instanceof Resizeable){
                Resizeable resizeable = (Resizeable) shapes[i];
                resizeable.resize(resizeNumber);
            }
            System.out.println(shapes[i]);
        }
    }
}
