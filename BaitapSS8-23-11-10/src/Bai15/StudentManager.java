package Bai15;

import Bai15.StudentService.StudentService;

import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        while(true){
            System.out.println("------MENU------");
            System.out.println("1.Thêm mới sinh viên\n" +
                    "2.Hiển thị danh sách sinh viên \n" +
                    "3.Sửa sinh viên theo ID\n" +
                    "4.Xóa sinh viên theo ID\n" +
                    "5.Tính điểm trung bình của tất cả sinh viên\n" +
                    "6.Sắp xếp sinh viên theo số điểm tăng dần\n" +
                    "7.Exit"
                    );
            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice){
                case 1 :
                    studentService.addStudent();
                    break;
                case 2 :
                    studentService.showAll();
                    break;
                case 3 :
                    studentService.updateStudent();
                    break;
                case 4 :
                    studentService.removeStudent();
                    break;
                case 5 :
                    System.out.println("Điểm trung bình của tất cả sinh viên là : ");
                    System.out.println(studentService.getAverageScore());
                    break;
                case 6 :
                    System.out.println("Sinh viên theo số điểm tăng dần : ");
                    studentService.sortByScore();
                    break;
                case 7 :
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập sai hãy nhập lại");
                    break;
            }
        }
    }
}
