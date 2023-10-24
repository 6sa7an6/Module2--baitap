package phan2;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi cần thay thế ký tự s thành t : ");
        String text = sc.nextLine();
        String result = swapStoT(text);
        System.out.println("Chuỗi sau khi chuyển đổi là : " + result);
    }

    public static String swapStoT(String text) {
        return text.replace("s", "t");
    }
}
