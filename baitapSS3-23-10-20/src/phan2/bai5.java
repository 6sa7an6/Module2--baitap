package phan2;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập chuỗi thứ 1 : ");
        String text1 = sc.nextLine();
        System.out.print("Hãy nhập chuỗi thứ 2 : ");
        String text2 = sc.nextLine();
        String total = concatString(text1,text2);
        System.out.println("Chuỗi sau khi gộp là :\n" + total);

    }
    public static String concatString(String text1 , String text2){
        return text1.concat(text2);
    }
}
