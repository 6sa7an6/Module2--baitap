import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số cần kiểm tra : ");
        int numb = sc.nextInt();
        String str = "";
        if (numb < 0 || numb > 999) {
            System.out.println("out of ability");
        } else if (numb == 0) {
            System.out.println("zero");
        }
        int hundred = numb / 100;
        if (hundred != 0) {
            switch (hundred) {
                case 1:
                    str += "one hundred";
                    break;
                case 2:
                    str += "two hundred";
                    break;
                case 3:
                    str += "three hundred";
                    break;
                case 4:
                    str += "four hundred";
                    break;
                case 5:
                    str += "five hundred";
                    break;
                case 6:
                    str += "six hundred";
                    break;
                case 7:
                    str += "seven hundred";
                    break;
                case 8:
                    str += "eight hundred";
                    break;
                case 9:
                    str += "nine hundred";
                    break;
                default:
            }
        }
        int result = numb % 100;
        if (result != 0) {
            if (result < 10) {
                switch (result) {
                    case 1:
                        str += " one";
                        break;
                    case 2:
                        str += " two";
                        break;
                    case 3:
                        str += " three";
                        break;
                    case 4:
                        str += " four";
                        break;
                    case 5:
                        str += " five";
                        break;
                    case 6:
                        str += " six";
                        break;
                    case 7:
                        str += " seven";
                        break;
                    case 8:
                        str += " eight";
                        break;
                    case 9:
                        str += " nine";
                        break;
                    default:
                }
            } else if (result <= 19) {
                switch (result) {
                    case 11:
                        str += " eleven";
                        break;
                    case 12:
                        str += " twelve";
                        break;
                    case 13:
                        str += " thirteen";
                        break;
                    case 14:
                        str += " fourteen";
                        break;
                    case 15:
                        str += " fifteen";
                        break;
                    case 16:
                        str += " sixteen";
                        break;
                    case 17:
                        str += " seventeen";
                        break;
                    case 18:
                        str += " eighteen";
                        break;
                    case 19:
                        str += " nineteen";
                        break;
                }
            } else
            {
                int tens = result / 10;
                int ones = result % 10;
                switch (tens) {
                    case 2:
                        str += " twenty";
                        break;
                    case 3:
                        str += " thirty";
                        break;
                    case 4:
                        str += " forty";
                        break;
                    case 5:
                        str += " fifty";
                        break;
                    case 6:
                        str += " sixty";
                        break;
                    case 7:
                        str += " seventy";
                        break;
                    case 8:
                        str += " eighty";
                        break;
                    case 9:
                        str += " ninety";
                        break;
                    default:
                }
                if (ones > 0) {
                    switch (ones) {
                        case 1:
                            str += " one";
                            break;
                        case 2:
                            str += " two";
                            break;
                        case 3:
                            str += " three";
                            break;
                        case 4:
                            str += " four";
                            break;
                        case 5:
                            str += " five";
                            break;
                        case 6:
                            str += " six";
                            break;
                        case 7:
                            str += " seven";
                            break;
                        case 8:
                            str += " eight";
                            break;
                        case 9:
                            str += " nine";
                            break;
                        default:
                    }
                }
            }
        }
        System.out.println(str);
    }
}