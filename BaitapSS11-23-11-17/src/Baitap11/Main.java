package Baitap11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap ngay");
            int day = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap thang");
            int month = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap nam");
            int year = Integer.parseInt(sc.nextLine());
            if (year <= 0) {
                throw new DateException("Nam phai lon hon 0");
            }
            if (month < 1 || month > 12) {
                throw new DateException("Thang khong hop le");
            }
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day < 1 || day > 31) {
                        throw new DateException("Ngay khong hop le");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 1 || day > 30) {
                        throw new DateException("Ngay khong hop le");
                    }
                    break;
                case 2:
                    if (day < 1 || day > 28) {
                        throw new DateException("Thang 2 chi co 28 ngay");
                    }
                    break;

            }
            System.out.println("Ngay ban nhap la : " + day + "/" + month +"/"+year);
        } catch (DateException e) {
            System.err.println("Ngay thang nam ban nhap khong hop le : " + e.getMessage());
        }
    }
}
