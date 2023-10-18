public class bai3 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là :");
        System.out.println(1);
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}
