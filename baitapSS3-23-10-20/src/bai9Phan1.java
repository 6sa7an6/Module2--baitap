import java.util.Scanner;

public class bai9Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập độ dài mảng bạn muốn : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            System.out.printf("Hãy nhập phần tử thứ %d : ", i + 1);
            arr[i] = sc.nextInt();
        }
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
