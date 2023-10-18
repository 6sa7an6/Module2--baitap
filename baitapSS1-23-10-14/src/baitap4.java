import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập chiều dài : ");
        int l = sc.nextInt();
        System.out.print("Hãy nhập chiều rộng : ");
        int w = sc.nextInt();
        int d = (l + w) * 2;
        int s = l*w ;
        System.out.printf("Chu vi hình chữ nhật có chiều rộng %d và chiều dài %d là %d",l,w,d);
        System.out.printf("\nDiện tích hình chữ nhật có chiều rộng %d và chiều dài %d là %d",l,w,s);
    }
}
