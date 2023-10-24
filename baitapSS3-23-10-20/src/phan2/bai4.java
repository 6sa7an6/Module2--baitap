package phan2;

import java.util.Arrays;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi cần tách : ");
        String text = sc.nextLine();
        String[] arr = tachString(text);
        System.out.println(Arrays.toString(arr));
    }

    public static String[] tachString(String text) {
        String[] arr = text.split("");
        return arr;
    }
}
