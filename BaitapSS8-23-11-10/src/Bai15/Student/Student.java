package Bai15.Student;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        if(this.averageSore > o.averageSore){
            return 1;
        }else if(this.averageSore == o.averageSore){
            return 0;
        }else{
            return -1;
        }
    }

    private int studentID;
    private String name;
    private double averageSore;

    public Student() {
    }

    public Student(int studentID, String name, double averageSore) {
        this.studentID = studentID;
        this.name = name;
        this.averageSore = averageSore;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageSore() {
        return averageSore;
    }

    public void setAverageSore(double averageSore) {
        this.averageSore = averageSore;
    }

    @Override
    public String toString() {
        return "[" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", averageSore=" + averageSore +
                ']';
    }
}
