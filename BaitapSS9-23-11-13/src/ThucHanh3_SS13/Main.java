package ThucHanh3_SS13;

import ThucHanh3_SS13.Student.AgeComparator;
import ThucHanh3_SS13.Student.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Vũ", 12, "Hà Nội");
        Student s2 = new Student("Việt", 17, "Sài Gòn");
        Student s3 = new Student("Anh", 18, "Đà Nẵng");
        Student s4 = new Student("Tà", 15, "Nha Trang");
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        Collections.sort(students);
        System.out.println("Sắp xếp theo tên : ");
        for (Student student : students
        ) {
            System.out.println(student.toString());
        }
        System.out.println("Sắp xếp theo tuổi : ");
        AgeComparator ageComparator = new AgeComparator();
        students.sort(ageComparator);
        for (Student student : students
        ) {
            System.out.println(student.toString());
        }
    }
}
