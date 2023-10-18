import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số đầu : ");
        int numb1 = sc.nextInt();
        System.out.print("Hãy nhập số sau : ");
        int numb2 = sc.nextInt();
        int total = 0;
        for(int i = numb1 ; i<=numb2 ; i++){
            if(i%2 == 0){
                total += i;
            }
        }
        System.out.println(total);
    }
}