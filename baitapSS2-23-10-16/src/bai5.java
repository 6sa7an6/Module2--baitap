public class bai5 {
    public static void main(String[] args) {
        System.out.print("Số nguyên dương nhỏ nhất chia hết cho 5,7,11 là : ");
        int i = 1;
        while (true){i++;
            if(i%5 == 0 && i%7 == 0 && i%11 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
