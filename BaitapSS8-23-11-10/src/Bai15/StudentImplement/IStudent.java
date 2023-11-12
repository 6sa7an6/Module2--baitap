package Bai15.StudentImplement;

import Bai15.Student.Student;

import java.util.List;

public interface IStudent {
    void showAll();
    void addStudent();
    void updateStudent();
    void removeStudent();
    Student findStudentById(int id);

    double getAverageScore();
    void sortByScore();
}
