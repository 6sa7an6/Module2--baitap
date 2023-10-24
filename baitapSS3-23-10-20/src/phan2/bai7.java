package phan2;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Hãy nhập chuỗi gốc : ");
        String text = sc.nextLine();
        System.out.print("Hãy nhập chuỗi nối vào : ");
        String text1 = sc.nextLine();
        String resultStr = result(text,text1);
        System.out.println("Chuỗi sau khi nối là :\n"+resultStr);
    }
    public static String result(String text , String text1){
        StringBuffer result = new StringBuffer(text);
        return result.append(text1).toString();
    }
}
