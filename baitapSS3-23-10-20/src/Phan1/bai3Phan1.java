package Phan1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class bai3Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[6];
        int[] arr2 = new int[4];
        System.out.println("Hãy nhập 6 số cho mảng 1 :");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Hãy nhập 4 số cho mảng 2 :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] totalArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            totalArr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            totalArr[i + arr1.length] = arr2[i];
        }
        System.out.println("Mảng sau khi gộp là : " + Arrays.toString(totalArr));
    }
}
