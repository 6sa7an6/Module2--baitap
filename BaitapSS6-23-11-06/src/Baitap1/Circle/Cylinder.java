package Baitap1.Circle;

import Baitap1.Main;

public class Cylinder extends Circle{
    private int h;
    private double theTich;
    public int getH() {
        return h;
    }

    public double getTheTich() {
        return theTich;
    }

    public void setTheTich(double theTich) {
        this.theTich = theTich;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Cylinder() {
    }

    public Cylinder(int r, String color, int h) {
        super(r, color);
        this.h = h;
        this.theTich = theTich();
    }
    public double theTich(){
        return  Math.PI*getR()*getR()*h;
    }
    @Override
    public String toString() {
        return super.toString() + "The tich " + theTich;
    }
}
