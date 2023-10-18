import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chiều rộng :");
        int w = sc.nextInt();
        System.out.println("Hãy nhập chiều dài :");
        int l = sc.nextInt();
        System.out.printf("Chu vi của hình chữ nhật có chiều rộng %d , chiều dài %d là: %d", w,l,(w+l)*2 );
        System.out.printf("\n Diện tính của hình chữ nhật có chiều rộng %d , chiều dài %d là : %d",w,l,(w*l));
    }
}