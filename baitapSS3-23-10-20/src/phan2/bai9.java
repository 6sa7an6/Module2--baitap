package phan2;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Hãy nhập chuỗi gốc : ");
            String text1 = sc.nextLine();
            System.out.print("Hãy nhập chuỗi cần kiểm tra : ");
            String text2 = sc.nextLine();
            if(containsString(text1,text2)){
                System.out.println("Chuỗi gốc có chứa chuỗi bạn nhập !");
            }else{
                System.out.println("Chuỗi gốc không chứa chuỗi bạn nhập ! ");
            }
        }
        public static boolean containsString(String text1 , String text2){
            return text1.contains(text2);
        }
    }
