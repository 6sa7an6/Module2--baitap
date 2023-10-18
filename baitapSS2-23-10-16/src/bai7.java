import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2.Tính chu vi và diện tích hình tam giác\n" +
                    "3.Tính chu vi và diện tích hình tròn.\n" +
                    "4.Thoát\n");
            int numb = sc.nextInt();
            switch (numb){
                case 1 :
                    System.out.print("Hãy nhập chiều rộng :");
                    int w = sc.nextInt();
                    System.out.print("Hãy nhập chiều dài :");
                    int l = sc.nextInt();
                    System.out.printf("Chu vi của hình chữ nhật có chiều rộng bằng %d và chiều dài bằng %d là %d\n ",w , l , (w+l)*2);
                    System.out.printf("Diện tích của hình chữ nhật có chiều rộng bằng %d và chiều dài bằng %d là %d\n ",w , l , w*l);
                    break;
                case 2:
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
                    break;
                case 3 :
                    final double PI = 3.14;
                    System.out.print("Hãy nhập bán kính của hình tròn bạn muốn tính : ");
                    int r = sc.nextInt();
                    double s = Math.pow(r,2);
                    System.out.printf("Chu vi của hình tròn có bán kính bằng %d là %.2f\n ",r , 2*PI*r);
                    System.out.printf("Diện tích hình tròn có bán kính bằng %d là %.2f\n ",r,s);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Bạn đã nhập sai yêu cầu nhập lại :");

            }
            if(numb == 4)break;
        }
    }
}
