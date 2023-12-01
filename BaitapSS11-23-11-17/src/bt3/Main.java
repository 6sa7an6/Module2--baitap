package bt3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu : ");
        int l = Integer.parseInt(sc.nextLine());
        String[] arr = new String[l];
        for (int i = 0; i < l; i++) {
            System.out.print("Nhap so nguyen thu " + (i + 1) + " : ");
            arr[i] = sc.nextLine();
        }
        // kiem tra phan tu la so va tinh tong
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                int num = Integer.parseInt(arr[i]);
                sum += num;
            }catch (NumberFormatException e){
                System.err.println("Gia tri " + arr[i] +" khong phai la so");
            }
        }
        System.out.println("tong cac so nguyen la " + sum);
    }
}
