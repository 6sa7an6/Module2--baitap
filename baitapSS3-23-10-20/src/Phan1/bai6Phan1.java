package Phan1;

import java.util.Scanner;

public class bai6Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số mảng bạn muốn : ");
        int i = sc.nextInt();
        System.out.print("Hãy nhập số phần tử có trong mảng mà bạn muốn : ");
        int j = sc.nextInt();
        System.out.print("Hãy nhập cột mà bạn muốn tính tổng : ");
        int numb = sc.nextInt();
        if(numb <= j+1){
            int total = 0;
            int[][] arr = new int[i][j];
            for (int k = 0; k < i; k++) {
                for (int l = 0; l < j; l++) {
                    System.out.printf("Hãy nhập số phần tử thứ %d có trong mảng %d : ", l + 1, k + 1);
                    arr[k][l] = sc.nextInt();
                    if (l + 1 == numb) {
                        total += arr[k][l];
                    }
                }
            }
            System.out.printf("Tổng các phần tử ở cột %d là : %d ", numb, total);
        }else{
            System.out.println("Cột bạn nhập không hợp lệ !");
        }
    }
}
