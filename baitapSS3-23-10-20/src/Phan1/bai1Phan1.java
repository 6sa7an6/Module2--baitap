package Phan1;

import java.util.Arrays;
import java.util.Scanner;

public class bai1Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrInt = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println(Arrays.toString(arrInt));
        System.out.print("Hãy nhập số muốn xóa trong mảng : ");
        int numb = sc.nextInt();
        int[] newArr = deleteNumb(numb, arrInt);
        if (newArr == arrInt) {
            System.out.println("Số bạn nhập không có trong mảng");
        } else {
            System.out.println("Mảng mới là " + Arrays.toString(newArr));
        }

    }

    public static int[] deleteNumb(int numb, int[] arrInt) {
        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] == numb) {
                count++;
            }
        }
        if (count == 0) {
            return arrInt;
        }
        int[] newArr = new int[arrInt.length - count];
        int newIndex = 0;
        for (int i = 0; i < arrInt.length - 1; i++) {
            if (numb != arrInt[i]) {
                newArr[newIndex] = arrInt[i];
                newIndex++;
            }
        }
        return newArr;
    }
}
