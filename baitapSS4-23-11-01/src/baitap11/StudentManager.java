package baitap11;

import baitap11.Student.Student;

import java.util.Random;
import java.util.Scanner;

public class StudentManager {
    private static Student[] students = new Student[100];
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.Hiển thị danh sách sinh viên\n" +
                    "2.Thêm mới sinh viên\n" +
                    "3.Update thông tin sinh viên theo id\n" +
                    "4.Xoá sinh viên theo id\n" +
                    "5.Thoát\n");
            System.out.print("Nhập lựa chọn của bạn : ");
            byte choice = sc.nextByte();
            switch (choice){
                case 1 :
                    showAllStudent();
                    break;
                case 2 :
                    createStudent();
                    break;
                case 3 :
                    System.out.println("Nhập ID cần sửa : ");
                    int idUpdate = sc.nextInt();
                    updateStudent(idUpdate);
                    break;
                case 4 :
                    System.out.println("Nhập ID cần xóa : ");
                    int idDel = sc.nextInt();
                    deleteStudent(idDel);
                    break;
                case 5 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai mời nhập lại ");
            }
        }
    }
    public static void createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên cần thêm mới ");
        int quantity = sc.nextInt();
        if(quantity > students.length - count){
            System.out.println("Vượt quá số lượng thêm mới ");
            return;
        }else{
            for(int i = 0 ; i < quantity ; i ++){
                Student newStudent = new Student();
                System.out.println("Nhập thông tin cho sinh viên thứ " + (i+1));
                System.out.println("Nhập id");
                newStudent.setStudentId(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập tên sinh viên");
                newStudent.setStudentName(sc.nextLine());
                System.out.println("Nhập giới tính : true(Nam)/false(Nu) ");
                newStudent.setSex(sc.nextLine().equals("true"));
                System.out.println("Nhập tên lớp");
                newStudent.setClassName(sc.nextLine());
                System.out.println("Nhập tuổi ");
                newStudent.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập địa chỉ sinh viên");
                newStudent.setAddress(sc.nextLine());
                students[count++] = newStudent;
            }
            System.out.println("Thêm mới thành công ");
        }
    }
    public static void updateStudent(int idEdit){
        Scanner sc = new Scanner(System.in);
        int index = getIndexByStudentID(idEdit);
            if(index == -1){
                System.out.println("Không tìm thấy sinh viên phù hợp ");
                return;
            }
        System.out.println("Thông tin sinh viên cũ ");
        System.out.println(students[index]);
        System.out.println("Nhập tên sinh viên mới ");
        students[index].setStudentName(sc.nextLine());
        System.out.println("Nhập giới tính : true(Nam)/false(Nu) ");
        students[index].setSex(sc.nextLine().equals("true"));
        System.out.println("Nhập tên lớp");
        students[index].setClassName(sc.nextLine());
        System.out.println("Nhập tuổi ");
        students[index].setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập địa chỉ sinh viên");
        students[index].setAddress(sc.nextLine());
        System.out.println("Cập nhật thành công ");
        }
    public static void showAllStudent(){
        if(count == 0){
            System.out.println("danh sách sinh viên trống");
            return;
        }else{
            for(int i = 0 ; i < count; i++){
                System.out.println(students[i]);
            }
        }
    }
    public static void deleteStudent(int idDelete){
        int index = getIndexByStudentID(idDelete);
        if(index == -1){
            System.out.println("Không tìm thấy sinh viên nào phù hợp ");
            return;
        }else{
            for(int i = index +1 ; i < count ; i++){
                students[i-1] = students[i];
            }
            students[count-1] = null;
            count--;
            System.out.println("Xóa thành công");
        }
    }
    public static int getIndexByStudentID(int id){
        for(int i = 0 ; i < count ; i++){
            if(id == students[i].getStudentId()){
                return i;
            }
        }
        return -1;
    }
}
