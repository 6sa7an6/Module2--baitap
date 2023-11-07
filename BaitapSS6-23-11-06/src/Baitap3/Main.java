package Baitap3;

import Baitap3.Point.MoveablePoint;
import Baitap3.Point.Point;

public class Main {
    public static void main(String[] args) {
        Point newPoint = new Point();
        newPoint.setXY(1,5);
        MoveablePoint newMoveablePoint = new MoveablePoint();
        newMoveablePoint.setSpeed(5,8);
        newMoveablePoint.move();
        System.out.println("newPoint" + newPoint);
        System.out.println("newMoveablePoint" + newMoveablePoint);
    }
}
