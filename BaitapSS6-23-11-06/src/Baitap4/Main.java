package Baitap4;

import Baitap4.Shape.Shape;
import Baitap4.Shape.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape newShape = new Shape();
        Triangle newTriangle = new Triangle();
        System.out.println("Hãy nhập độ dài 3 cạnh ! ");
        System.out.print("Cạnh 1 : ");
        double a = Double.parseDouble(sc.nextLine());
        newShape.setSide1(a);
        System.out.print("Cạnh 2 : ");
        double b = Double.parseDouble(sc.nextLine());
        newShape.setSide2(b);
        System.out.print("Cạnh 3 : ");
        double c = Double.parseDouble(sc.nextLine());
        newShape.setSide3(c);
        System.out.println("Thông tin 3 cạnh là : " +newShape);
        if(a+b>c && a+c>b && b+c>a){
            newTriangle.setSide1(a);
            newTriangle.setSide2(b);
            newTriangle.setSide3(c);
            System.out.println("Hãy nhập màu sắc tam giác : ");
            newTriangle.setColor(sc.nextLine());
            System.out.println("Thông tin tam giác được tạo thành từ 3 cạnh là : " +newTriangle);
        }else{
            System.out.println("Không có tam giác thỏa mãn 3 cạnh trên ");
        }
    }
}
