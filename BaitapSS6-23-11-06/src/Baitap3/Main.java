package Baitap3;

import Baitap3.Point.MoveablePoint;
import Baitap3.Point.Point;

public class Main {
    public static void main(String[] args) {
        Point newPoint = new Point(1,5);
        MoveablePoint newMoveablePoint = new MoveablePoint(1,5,8,9);
        newMoveablePoint.move();
        System.out.println("newPoint" + newPoint);
        System.out.println("newMoveablePoint" + newMoveablePoint);
    }
}
