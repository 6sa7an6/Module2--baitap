package phan2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi thứ 1 :");
        String text1 = sc.nextLine();
        System.out.println("Hãy nhập chuỗi thứ 2 :");
        String text2 = sc.nextLine();
        if(text1.equals(text2)){
            System.out.println("2 chuỗi bạn nhập giống nhau");
        }else{
            System.out.println("2 chuỗi bạn nhập khác nhau");
        }
    }
}
