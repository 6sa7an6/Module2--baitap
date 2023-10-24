package phan2;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi cần loại bỏ khoảng trắng : ");
        String text = sc.nextLine();
        String result = deleteSpace(text);
        System.out.println("Chuỗi sau khi chuyển đổi là : " + result);
    }

    public static String deleteSpace(String text) {
        return text.trim();
    }
}
