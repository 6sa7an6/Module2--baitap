package RA.business.daoimpl;

import RA.business.dao.IProductDao;
import RA.business.entity.Product;
import RA.util.IOFile;
import RA.util.InputMethods;

import java.util.*;
import java.util.stream.Collectors;

public class ProductDaoImpl implements IProductDao {
    public static List<Product> products;

    public ProductDaoImpl() {
        products = IOFile.getListFromFile(IOFile.PRODUCT_PATH);
    }

    @Override
    public List<Product> findAll() {
        if(!products.isEmpty()){
            return products;
        }
        return null;
    }

    @Override
    public Product findbyId(Long id) {
        for (Product p:products
             ) {
            if(Objects.equals(p.getProductId(), id)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void add(Product product) {
        products.add(product);
        // them moi xong thi luu vao file
        IOFile.writeToFile(IOFile.PRODUCT_PATH,products);
    }

    @Override
    public void update(Product product) {
        products.set(products.indexOf(findbyId(product.getProductId())),product);
        // sua xong thi luu vao file
        IOFile.writeToFile(IOFile.PRODUCT_PATH,products);
    }

    @Override
    public List<Product> findByName(String productName) {
        return products.stream().filter(c->c.getProductName().contains(productName)).collect(Collectors.toList());
    }

    @Override
    public void showNameAndId() {
        Map<String, Long> map = new TreeMap<>();
        for (int i = 0; i < products.size(); i++) {
            map.put(products.get(i).getProductName(), products.get(i).getProductId());
        }
        ;
        for (Map.Entry<String, Long> en : map.entrySet()) {
            System.out.println(en.getKey() + "/" + en.getValue());
        }
    }

    @Override
    public Long[] validateIds() {
        Long[] idsNumber;
        boolean check;
        do {
            check = true;
            System.out.println("Hãy nhập ID những sản phẩm cần ẩn (cách nhau bởi dấu phẩy) : ");
            String ids = InputMethods.getString();
            String[] idsString = ids.split(",");
            idsNumber = new Long[idsString.length];
            for (int i = 0; i < idsString.length; i++) {
                try {
                    // Ép kiểu
                    idsNumber[i] = Long.parseLong(idsString[i]);
                } catch (NumberFormatException e) {
                    // Nếu có lỗi khi ép kiểu -> bắt lỗi
                    System.err.println("ID phải là số!");
                    check = false;
                    break;
                }
            }
            if (check) {
            for (int i = 0; i < idsNumber.length; i++) {
                if (idsNumber[i] <= 0) {
                    System.err.println("ID phải là số lớn hơn 0 !");
                    check = false;
                    break;
                } else if (findbyId(idsNumber[i]) == null) {
                    System.err.println("ID : " + idsNumber[i] + " không tồn tại!");
                    check = false;
                    break;
                }
            }
        }
        }while(!check);
        return idsNumber;
    }
}
