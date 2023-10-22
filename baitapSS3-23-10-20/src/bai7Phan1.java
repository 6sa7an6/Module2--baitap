import java.util.Scanner;

public class bai7Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập độ dài mảng bạn muốn : ");
        int i = sc.nextInt();
            int total = 0;
            int[][] arr = new int[i][i];
            for (int k = 0; k < i; k++) {
                for (int l = 0; l < i; l++) {
                    System.out.printf("Hãy nhập số phần tử thứ %d có trong mảng %d : ", l + 1, k + 1);
                    arr[k][l] = sc.nextInt();
                    if (k == l) {
                        total += arr[k][l];
                    }
                }
            }
            System.out.printf("Tổng các phần tử ở cột chéo là : %d ", total);
    }
}
