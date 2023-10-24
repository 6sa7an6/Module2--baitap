package phan2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập email cần kiểm tra : ");
        String email = sc.nextLine();
        String emailRegex = "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (isEmail(email, emailRegex)) {
            System.out.println("Email bạn nhập đúng định dạng . ");
        } else {
            System.out.println("Email bạn nhập không hợp lệ!");
        }
    }

    public static boolean isEmail(String email, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
