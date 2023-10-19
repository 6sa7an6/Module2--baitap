import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1.In hình chữ nhật (Rectangle)\n" +
                            "2.In hình tam giác vuông góc vuông ở 4 góc khác nhau: \n" +
                            "3.In hình tam giác cân ( Isosceles triangle)\n" +
                            "4.Exit\n"
            );
            int numb1 = sc.nextInt();
            switch (numb1) {
                case 1:
                    System.out.println("In hinh chu nhat");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    ;
                    break;
                case 2:
                    System.out.println(
                            "a.Trên cùng bên trái (top-left) \n" +
                                    "b.Trên cùng bên phải( top-right)\n" +
                                    "c.Dưới cùng bên trái( bottom-left) \n" +
                                    "d.Dưới cùng bên phải(bottom-right)\n"
                    );
                    String next = sc1.nextLine();
                    switch (next) {
                        case "a":
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case "b":
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = i; k < 5; k++) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case "c":
                            for (int i = 0; i <= 5; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                        case "d":
                            for (int i = 5; i >= 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 5; k >= i; k--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <5-i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    };
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Bạn đã nhập sai yêu cầu nhập lại");
            }
            if (numb1 == 4) break;
        }
    }
}

