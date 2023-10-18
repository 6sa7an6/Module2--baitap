import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Hãy nhập 3 cạnh của hình tam giác : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a+b>c&&b+c>a&&a+c>b&&a>0&&b>0&&c>0){
                int d = (a+b+c)/2;
                double result = Math.sqrt(d*(d-a)*(d-b)*(d-c));
                System.out.printf("Chu vi của hình tam giác có 3 cạnh bằng %d,%d,%d là %d\n ",a , b , c,a+b+c);
                System.out.printf("Diện tích của hình tam giác có 3 cạnh bằng %d,%d,%d là %.2f\n ",a , b , c,result);
                break;
            }else{
                System.out.println("3 cạnh không tạo thành 1 tam giác hợp lệ.");
            };
        };
    }
}
