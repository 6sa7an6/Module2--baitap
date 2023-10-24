package phan2;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Hãy nhập chuỗi gốc : ");
        String text = sc.nextLine();
        System.out.print("Hãy nhập chuỗi thay thế vào : ");
        String text1 = sc.nextLine();
        System.out.print("Hãy nhập vị trí bắt đầu thay thế : ");
        int start = sc1.nextInt();
        System.out.print("Hãy nhập vị trí kết thúc thay thế : ");
        int end = sc1.nextInt();
        String resultStr = result(text, text1, start, end);
        System.out.println("Chuỗi sau khi thay thế là :\n" + resultStr);
    }

    public static String result(String text, String text1, int start, int end) {
        StringBuffer result = new StringBuffer(text);
        return result.replace(start - 1, end, text1).toString();
    }
}
