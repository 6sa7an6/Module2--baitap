package baitap3;

import baitap3.StopWatch.StopWatch;
import javafx.scene.paint.Stop;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = random.nextInt(100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] sortedArr = selectionSort(arr);
        stopWatch.end();
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chon (selection sort) cho 100000 số là: " + elapsedTime + " milisecond giây");
    }
    public static int[] selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length -1 ; i++){
            int min = arr[i];
            for(int j = i+1 ; j < arr.length -1;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
