package baitap4_SS12;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng từ : ");
        int l = Integer.parseInt(sc.nextLine());
        Stack<String> stack = new Stack<>();
        Stack<String> stackReversed = new Stack<>();
        for(int i = 0 ; i < l ; i ++){
            System.out.print("Nhập từ thứ "+(i+1) +": ");
            String text = sc.nextLine();
            stack.push(text);
        }
        while(!stack.isEmpty()){
            stackReversed.push(stack.pop());
        }
        System.out.println("Mảng sau khi đảo ngược là : ");
        System.out.println(stackReversed);
    }
}
