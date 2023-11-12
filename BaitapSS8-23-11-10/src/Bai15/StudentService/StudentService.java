package Bai15.StudentService;

import Bai15.Student.Student;
import Bai15.StudentImplement.IStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent {
    Scanner sc = new Scanner(System.in);
    List<Student> students = new ArrayList<>();
    @Override
    public void showAll() {
        for (Student student:students
             ) {
            System.out.println(student);
        }
    }

    @Override
    public void addStudent() {
        Student student = new Student();
        System.out.println("---Thêm mới sinh viên---");
        System.out.print("Hãy nhập ID sinh viên : ");
        student.setStudentID(Integer.parseInt(sc.nextLine()));
        System.out.print("Hãy nhập tên sinh viên : ");
        student.setName(sc.nextLine());
        System.out.print("Hãy nhập điểm trung bình của sinh viên : ");
        student.setAverageSore(Double.parseDouble(sc.nextLine()));
        students.add(student);
    }

    @Override
    public void updateStudent() {
        System.out.println("---Sửa sinh viên---");
        System.out.print("Hãy nhập ID của sinh viên cần sửa : ");
        int editId = Integer.parseInt(sc.nextLine());
        Student student = findStudentById(editId);
        System.out.print("Hãy nhập tên sinh viên : ");
        student.setName(sc.nextLine());
        System.out.print("Hãy nhập điểm sinh viên : ");
        student.setAverageSore(Double.parseDouble(sc.nextLine()));
        students.set(students.indexOf(findStudentById(editId)),student);
        System.out.println("-----Sửa thành công-----");
    }

    @Override
    public void removeStudent() {
        System.out.println("---Xóa sinh viên---");
        System.out.print("Hãy nhập ID của sinh viên cần xóa : ");
        int delId = Integer.parseInt(sc.nextLine());
        students.remove(findStudentById(delId));
        System.out.println("-----Xóa thành công-----");
    }

    @Override
    public Student findStudentById(int id) {
        for (Student student:students
             ) {
            if(student.getStudentID() == id){
                return student;
            }
        }
        return null;
    }

    @Override
    public double getAverageScore() {
        double total = 0;
        for (Student student:students
             ) {
            total += student.getAverageSore();
        }
        return total/students.size();
    }

    @Override
    public void sortByScore() {
        Collections.sort(students);
        for (Student student:students
             ) {
            System.out.println(student);
        }
    }
}
