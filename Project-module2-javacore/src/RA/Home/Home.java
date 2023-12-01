package RA.Home;

import RA.util.IOFile;
import RA.util.InputMethods;
import RA.custonmer.account.User;

import java.util.ArrayList;
import java.util.List;

public class Home {

    public static void main(String[] args) {
        while (true) {
            System.out.println("------Trang chủ-----");
            System.out.println("1.Đăng nhập.");
            System.out.println("2.Đăng ký.");
            System.out.println("0.Thoát.");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Hãy nhập từ 0 -> 2 ");
                    break;
            }
        }
    }
}
