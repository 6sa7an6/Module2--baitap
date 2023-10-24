package phan2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi cần đảo ngược :");
        String text = sc.nextLine();
        StringBuffer reversedText = reverseText(text);
        System.out.println("Chuỗi sau khi đảo ngược là : "+reversedText);
    }
    public static StringBuffer reverseText(String text) {
        StringBuffer reversedText = new StringBuffer(text);
        return reversedText.reverse();
    }
}
