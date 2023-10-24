package Phan1;

import java.util.Scanner;

public class bai5Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập độ dài mảng bạn muốn : ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        for(int i = 0 ; i < l ; i++){
            System.out.printf("Hãy nhập phần tử thứ %d : ",i+1);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i ++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là : "+min);
    }
}
