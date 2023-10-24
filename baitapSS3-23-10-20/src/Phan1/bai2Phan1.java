package Phan1;

import java.util.Arrays;
import java.util.Scanner;

public class bai2Phan1 {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số muốn chèn trong mảng : ");
        int x = sc.nextInt();
        System.out.print("Hãy nhập vị trí muốn chèn trong mảng : ");
        int index = sc.nextInt();
        if(index <= -1 || index >=arr.length-1){
            System.out.println("Vị trí bạn nhập không hợp lệ");
        }else{
            int[] newArr = new int[arr.length+1];
            for(int i = 0 ; i < index ; i ++){
                newArr[i] = arr[i];
            }
            newArr[index] = x;
            for(int i = index + 1; i < arr.length ; i++){
                newArr[i] = arr[i-1];
            }
            System.out.println("Mảng mới sau khi thêm là : " + Arrays.toString(newArr));
        }
    }
}
