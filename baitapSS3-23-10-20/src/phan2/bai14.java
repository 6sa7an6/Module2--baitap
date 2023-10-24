package phan2;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi cần kiểm tra : ");
        String input = sc.nextLine();
        System.out.println("Hãy nhập độ dài cần kiểm tra : ");
        int l = sc.nextInt();
        if (checkLength(input, l)) {
            System.out.printf("Chuỗi bạn nhập dài hơn %d ", l);
        } else {
            System.out.printf("Chuỗi bạn nhập ngắn hơn %d ", l);
        }
    }

    public static boolean checkLength(String input, int l) {
        return input.length() > l;
    }
}
