import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2.Kiểm tra số nguyên tố.\n" +
                    "3.Kiểm tra một số có chia hết cho 3 không.\n" +
                    "4.Thoát\n");
            int numb = sc.nextInt();
            switch (numb) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra : ");
                    int a = sc.nextInt();
                    if (a % 2 == 0) {
                        System.out.printf("%d là số chẵn ", a);
                    } else {
                        System.out.printf("%d là số lẻ ", a);
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Nhập số cần kiểm tra :");
                    int b = sc.nextInt();
                    if (b == 1) {
                        System.out.printf("%d là số nguyên tố ", b);
                    } else {
                        boolean flag = true;
                        for (int i = 2; i < b; i++) {
                            if (b % i == 0) {
                                flag = false;
                            }
                        }
                        if (flag) {
                            System.out.printf("%d là số nguyên tố ", b);
                        } else {
                            System.out.printf("%d không phải là số nguyên tố ", b);
                        }
                    };
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Nhập số cần kiểm tra :");
                    int c = sc.nextInt();
                    if (c % 3 == 0) {
                        System.out.printf("%d là số chia hết cho 3 ", c);
                    } else {
                        System.out.printf("%d không phải số chia hết cho 3 ", c);
                    };
                    System.out.println();

                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Bạn đã nhập sai , hãy nhập lại .");
            }
            if(numb == 4)break;
        }

    }
}
