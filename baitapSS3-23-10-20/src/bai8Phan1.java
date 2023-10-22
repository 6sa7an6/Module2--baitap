import java.util.Scanner;

import static jdk.nashorn.tools.ShellFunctions.input;

public class bai8Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bạn cần kiểm tra : ");
        String input = sc.nextLine();
        while (true) {
            System.out.print("Nhập ký tự bạn cần kiểm tra : ");
            String str = sc.nextLine();
            if (str.length() == 1) {
                char character = str.charAt(0);
                int count = 0;
                for (int i = 0; i < input.length(); i++) {
                    if (character == input.charAt(i)) {
                        count++;
                    }
                }
                System.out.println("Ký tự " + character + " xuất hiện " + count + " lần");
                break;
            } else {
                System.out.println("Hãy nhập 1 ký tự ");
            }
        }
    }
}
