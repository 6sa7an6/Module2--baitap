package baitap2.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(double a,double b,double c){
        return b*2 - 4*a*c;
    }
    public double getRoot1(){
        return (-b + Math.pow(b*b-4*a*c,0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.pow(b*b-4*a*c,0.5))/(2*a);
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a : ");
        this.a = sc.nextDouble();
        System.out.print("Nhập số b : ");
        this.b = sc.nextDouble();
        System.out.print("Nhập số c : ");
        this.c = sc.nextDouble();
    }
    public void displayData(){
        if(getDiscriminant(a,b,c)>0){
            System.out.println("Nghiệm 1 : " + getRoot1());
            System.out.println("Nghiệm 2 : " + getRoot2());
        }else if(getDiscriminant(a,b,c) == 0){
            System.out.println("Nghiệm là : " + getRoot1());
        }else{
            System.out.println("The equation has no root");
        }
    }
}
