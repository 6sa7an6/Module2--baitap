import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập điểm Toán :");
        int t = sc.nextInt();
        System.out.print("Hãy nhập điểm Lý :");
        int l = sc.nextInt();
        System.out.print("Hãy nhập điểm Hóa :");
        int h = sc.nextInt();
        System.out.print("Hãy nhập điểm Văn :");
        int v = sc.nextInt();
        System.out.print("Hãy nhập điểm Tiếng Anh :");
        int a = sc.nextInt();
        double tb =   (double) (t + l + h + v + a) /5;
        if (0<= tb && tb < 5){
            System.out.printf("Xếp loại của bạn là Yếu với điểm trung bình là %.1f",tb);
        }else if(tb < 6.5){
            System.out.printf("xếp loaị của bạn là Trung bình với điểm trung bình là %.1f",tb);
        }else if(tb < 8){
            System.out.printf("Xếp loại của bạn là khá với điểm trung bình là %.1f",tb);
        }else if(tb < 9){
            System.out.printf("Xếp loại của bạn là giỏi với điểm trung bình là %.1f",tb);
        }else if(tb <= 10){
            System.out.printf("Xếp loại của bạn là xuất sắc với điểm trung bình là %.1f",tb);
        }else{
            System.out.println(("Điểm bạn nhập không hợp lệ"));
        }
    }
}