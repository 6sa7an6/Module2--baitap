package baitap1;

import baitap1.CreateCircle.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        // Nhap thong tin
        circle.inputData();
        // Hien thi thong tin
        circle.displayData();
        //Hiển thị chu vi + diện tích
        System.out.printf("Chu vi là %.2f \n",circle.Chuvi());
        System.out.printf("Diện tích là %.2f ",circle.DienTich());
    }
}
