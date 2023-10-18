import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Hãy nhập số lượng số nguyên tố đầu tiên muốn hiển thị : ");
            int numb = sc.nextInt();
            int count = 0;
            System.out.println(1);
            for(int i = 2 ; ;i++){
                boolean flag = true;
                for(int j = 2 ; j < i ; j++){
                    if(i%j == 0){
                        flag = false;
                    }
                }
                if(flag){
                    System.out.println(i);
                    count ++;
                }
                if(count == numb - 1){
                    break;
                }
            }
        }
    }
}
