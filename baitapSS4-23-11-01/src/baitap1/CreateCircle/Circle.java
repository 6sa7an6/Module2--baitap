package baitap1.CreateCircle;

import baitap1.Main;

import java.util.Scanner;

public class Circle {
    private double r;
    private String color;
    public Circle(){};

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double Chuvi(){
        return Math.PI*r*2;
    }
    public double DienTich(){
        return Math.PI*r*r;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn : ");
        this.r = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập màu hình tròn : ");
        this.color = sc.nextLine();
    }
    public void displayData(){
        System.out.println("Thông tin của hình tròn : ");
        System.out.println("Bán kính : "+r + " | Màu sắc : "+color);
    }
}
