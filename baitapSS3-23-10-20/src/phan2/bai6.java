package phan2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Hãy nhập chuỗi gốc : ");
        String text = sc.nextLine();
        System.out.print("Hãy nhập chuỗi chèn vào : ");
        String text1 = sc.nextLine();
        System.out.print("Hãy nhập vị trí chèn : ");
        int start = sc1.nextInt();
        String resultStr = result(text, text1, start);
        System.out.println("Chuỗi sau khi chèn là :\n" + resultStr);
    }

    public static String result(String text, String text1, int start) {
        StringBuffer result = new StringBuffer(text);
        return result.insert(start , text1).toString();
    }
}
