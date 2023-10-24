package phan2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi cần kiểm tra : ");
        String text = sc.nextLine();
        if(text.isEmpty()){
            System.out.println("Chuỗi bạn nhập là chuỗi rỗng ");
        }else{
            System.out.println("Chuỗi bạn nhập không phải chuỗi rỗng ");
        }
    }
}
