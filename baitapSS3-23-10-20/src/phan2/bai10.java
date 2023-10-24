package phan2;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi cần chuyển đổi : ");
        String text = sc.nextLine();
        String result = chuyenDoi(text);
        System.out.println("Chuỗi sau khi chuyển đổi là : " + result);
    }
    public static String chuyenDoi(String text){
        char[] charArray = text.toCharArray();
        for(int i = 0 ; i < charArray.length ; i ++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i] = Character.toLowerCase(charArray[i]);
            }else{
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
}