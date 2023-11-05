package baitap6;

import baitap6.Employee.Employee;

import java.util.Scanner;

public class Main {
    static Employee[] employees = new Employee[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.Hiển thị danh sách nhân viên\n" +
                    "2.Thêm mới nhân viên\n" +
                    "3.Update thông tin nhân theo id\n" +
                    "4.Xoá nhân viên theo id\n" +
                    "5.Thoát\n");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    showAllEmployee();
                    break;
                case 2:
                    createEmployee();
                    break;
                case 3:
                    updateEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                default:
                    System.out.println("Nhập sai mời nhập lại!");
            }
            if (choice == 5) {
                break;
            }
        }
    }

    public static void showAllEmployee() {
        for (int i = 0; i <= count; i++) {
            if (count == 0) {
                System.out.println("Danh sách nhân viên trống");
            } else {
                System.out.println(employees[i]);
            }
        }
    }

    public static void createEmployee() {
        System.out.print("Hãy nhập số lượng nhân viên cần thêm : ");
        int quantity = Integer.parseInt(sc.nextLine());
        if (quantity > employees.length - count) {
            System.out.println("Dữ liệu nhập vượt quá ");
        } else {
            for (int i = 0; i < quantity; i++) {
                Employee newEmployee = new Employee();
                System.out.print("Hãy nhập mã nhân viên thứ " + (i + 1) + " : ");
                newEmployee.setEmployeeId(Integer.parseInt(sc.nextLine()));
                System.out.print("Hãy nhập tên nhân viên : ");
                newEmployee.setEmployeeName(sc.nextLine());
                System.out.print("Hãy nhập tuổi : ");
                newEmployee.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("Hãy nhập giới tính (Nam)/(Nữ) : ");
                String gender = sc.nextLine();
                switch (gender) {
                    case "Nam":
                        newEmployee.setGender("Nam");
                        break;
                    case "Nu":
                        newEmployee.setGender("Nu");
                        break;
                    default:
                        System.out.println("Nhập sai hãy nhập lại ");
                        break;
                }
                System.out.print("Hãy nhập hệ số lương : ");
                newEmployee.setRate(Double.parseDouble(sc.nextLine()));
                System.out.println("Nhập thành công thông tin nhân viên thứ " + (i + 1));
                employees[count++] = newEmployee;
            }
        }
    }

    public static void updateEmployee() {
        System.out.print("Hãy nhập ID nhân viên cần sửa : ");
        int id = Integer.parseInt(sc.nextLine());
        int index = getIndexEmployee(id);
        if (index == -1) {
            System.out.println("Không có ID này");
        } else {
            System.out.println("Thông tin cũ : " + employees[index]);
            System.out.print("Nhập lại ID nhân viên thứ " + (index + 1) + " : ");
            employees[index].setEmployeeId(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhập lại tên nhân viên : ");
            employees[index].setEmployeeName(sc.nextLine());
            System.out.print("Nhập tuổi : ");
            employees[index].setAge(Integer.parseInt(sc.nextLine()));
            System.out.print("Nhập giới tính (Nam)/(Nữ) : ");
            String gender = sc.nextLine();
            switch (gender) {
                case "Nam":
                    employees[index].setGender("Nam");
                    break;
                case "Nu":
                    employees[index].setGender("Nu");
                    break;
                default:
                    System.out.println("Nhập sai hãy nhập lại ");
                    break;
            }
            System.out.print("Hãy nhập hệ số lương : ");
            employees[index].setRate(Double.parseDouble(sc.nextLine()));
            System.out.println("Sửa thành công thông tin nhân viên thứ " + (index + 1));
        }
    }

    public static void deleteEmployee() {
        System.out.print("Hãy nhập ID nhân viên cần xóa : ");
        int id = Integer.parseInt(sc.nextLine());
        int index = getIndexEmployee(id);
        if (index == -1) {
            System.out.println("Không có ID này");
        } else {
            for (int i = index; i < count; i++) {
                employees[i] = employees[i + 1];
            }
            employees[count - 1] = null;
            count--;
            System.out.println("Xóa thành công ");
        }
    }

    public static int getIndexEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (id == employees[i].getEmployeeId()) {
                return i;
            }
        }
        return -1;
    }
}
