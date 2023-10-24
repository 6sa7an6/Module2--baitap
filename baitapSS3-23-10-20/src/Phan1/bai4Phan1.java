package Phan1;

import java.util.Arrays;
import java.util.Scanner;

public class bai4Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số mảng bạn muốn : ");
        int i = sc.nextInt();
        System.out.print("Hãy nhập số phần tử có trong mảng mà bạn muốn : ");
        int j = sc.nextInt();
        int[][] arr = new int[i][j];
        int max = 0;
        int maxI = 0;
        int maxJ = 0;
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.printf("Hãy nhập số phần tử thứ %d có trong mảng %d : ", l + 1, k + 1);
                arr[k][l] = sc.nextInt();
                if (arr[k][l] > max) {
                    max = arr[k][l];
                    maxI = k;
                    maxJ = l;
                }
            }
        }
        System.out.printf("Số lớn nhất trong mảng là %d có vị trí i = %d và j = %d ", max, maxI + 1, maxJ + 1);
    }
}
