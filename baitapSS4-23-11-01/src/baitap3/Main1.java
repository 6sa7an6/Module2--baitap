package baitap3;

import baitap3.StopWatch1.StopWatch1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch1 watch = new StopWatch1();
        watch.start();
        while (true){
            int numb = Integer.parseInt(sc.nextLine());
            if(numb == 0){
                watch.stop();
                break;
            }
        }
        System.out.println(watch.getElapsedTime1());
    }
}
