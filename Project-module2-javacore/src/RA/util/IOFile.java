package RA.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public static String PRODUCT_PATH = "C:\\Users\\Admin\\Desktop\\MD2-java-baitap\\Project-module2-javacore\\src\\RA\\data\\product.txt";
    public static String CATALOG_PATH = "C:\\Users\\Admin\\Desktop\\MD2-java-baitap\\Project-module2-javacore\\src\\RA\\data\\catalog.txt";
    public static String USER_PATH = "C:\\Users\\Admin\\Desktop\\MD2-java-baitap\\Project-module2-javacore\\src\\RA\\data\\user.txt";
    public static String ORDER_PATH = "C:\\Users\\Admin\\Desktop\\MD2-java-baitap\\Project-module2-javacore\\src\\RA\\data\\order.txt";
    public static String ISLOGIN_PATH = "C:\\Users\\Admin\\Desktop\\MD2-java-baitap\\Project-module2-javacore\\src\\RA\\data\\isLogin.txt";
    public static <T> List<T> getListFromFile(String path){
        File file = new File(path);// File là lớp đại diện cho 1 tệp , 1 thư mục trong thư mục
        if(!file.exists()) // kiểm tra sự tồn tại
        {
            return new ArrayList<>();
        }
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file); // cho phép đọc dữ liệu
            ObjectInputStream ois = new ObjectInputStream(fis); // Hỗ trợ độc file
            list = (List<T>) ois.readObject();

            // Đóng stream
            ois.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!");;
        } catch (IOException e) {
            System.err.println("Lỗi không đọc được file");;
        } catch (ClassNotFoundException e) {
            System.err.println("Không thể ép về class!");
        }
        return list;
    };
    public static <T> void  writeToFile(String path,List<T> list){
        File file = new File(path);
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list); // Ghi ra file

            // đóng stream
            oos.close();
        } catch (FileNotFoundException e) {
            System.err.println("Không tìm thấy file!");
        } catch (IOException e) {
            System.err.println("Lỗi ghi file!");
        }
    }
}
