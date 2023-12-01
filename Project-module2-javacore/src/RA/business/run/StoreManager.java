package RA.business.run;

import RA.business.entity.Catalog;
import RA.business.entity.Product;
import RA.business.service.ICatalogService;
import RA.business.service.IProductService;
import RA.business.serviceimpl.CatalogServiceImpl;
import RA.business.serviceimpl.ProductServiceImpl;
import RA.util.InputMethods;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

import static RA.business.daoimpl.CatalogDaoImpl.catalogs;

public class StoreManager {
    private static ICatalogService catalogService = new CatalogServiceImpl();
    private static IProductService productService = new ProductServiceImpl();

    public static void main(String[] args) {
        // chạy chương trình

        //b1 điều hướng menu :
        // công nghệ sử dụng :
        // dowhile để duy trì ứng dụng lặp mãi mãi
        //switch-case để phân chia chức năng do người dùng nhập vào
        // I/O data
        // xử lý ngoại lệ

        // Hiển thị menu chức năng
        do {
            System.out.println("-----Menu chức năng-----");
            System.out.println("1.Quản lý danh mục.");
            System.out.println("2.Quản lý sản phẩm.");
            System.out.println("0.Thoát chương trình.");

            // Yêu cầu người dùng nhập lựa chọn
            System.out.print("Hãy nhập vào lựa chọn của bạn : ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    menuCatalog();
                    // dieu huong menu danh muc
                    break;
                case 2:
                    menuProduct();
                    // dieu huong menu san pham
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    System.exit(0);
                default:
                    System.err.println("Hãy nhập lựa chọn từ 0 -> 2 !");
            }
        } while (true);
    }

    // xu ly cac chuc nang cua danh muc
    public static void menuCatalog() {
        while (true) {
            System.out.println("-----Menu quản lý danh mục-----");
            System.out.println("1.Hiển thị danh sách danh mục.");
            System.out.println("2.Tạo mới danh mục.");
            System.out.println("3.Tìm kiếm danh mục theo tên.");
            System.out.println("4.Chỉnh sửa thông tin danh mục.");
            System.out.println("5.Ẩn/Hiện danh mục theo mã danh mục.");
            System.out.println("6.Ẩn nhiều danh mục trong danh sách mã danh mục nhập vào.");
            System.out.println("0.Thoát menu quản lý danh mục .");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // Hiển thị danh sách danh mục : sắp xếp theo thời gian thêm mới nhất
                    displayCatalog(catalogService.findAllOrderByCreatedDate());
                    break;
                case 2:
                    // Tạo mới danh mục
                    addCatalog();
                    break;
                case 3:
                    // Tìm kiếm danh mục theo tên - tìm kiếm tương đối
                    System.out.print("Hãy nhập tên cần tìm kiếm : ");
                    String input = InputMethods.getString();
                    List<Catalog> catalogResult = catalogService.findByName(input);
                    displayCatalog(catalogResult);
                    break;
                case 4:
                    // Chỉnh sửa thông tin danh mục - không chỉnh sửa trạng thái
                    updateCatalogForID();
                    break;
                case 5:
                    // Chuyển trạng thái danh mục về true / false
                    catalogUpdateShowHiddenForId();
                    break;
                case 6:
                    //Ẩn nhiều danh mục trong danh sách mã danh mục nhập vào
                    System.out.println("Danh mục/Id hiện có : ");
                    catalogService.showNameAndId();
                    Long[] idsNumber = catalogService.validateIds();
                    for(int i = 0 ; i < idsNumber.length ;i++){
                        Catalog catalogUpdate = catalogService.findById(idsNumber[i]);
                        catalogUpdate.setStatusCatalog(false);
                        catalogService.update(catalogUpdate);
                    }
                    System.out.println("Ẩn danh mục thành công !");
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Hãy nhập lựa chọn từ 0 -> 5 !");
            }
        }
    }

    private static void catalogUpdateShowHiddenForId() {
        System.out.println("Danh mục và Id hiện có : ");
        catalogService.showNameAndId();
        System.out.print("Hãy nhập ID danh mục cần chỉnh sửa : ");
        Long id = InputMethods.getLong();
        while (catalogService.findById(id) == null) {
            System.err.println("ID bạn nhập không tồn tại , hãy nhập lại ID!");
            id = InputMethods.getLong();
        }
        Catalog catalogShowHidden = catalogService.findById(id);
        System.out.print("Hãy nhập Hiện/Ẩn danh mục (true/false) : ");
        catalogShowHidden.setStatusCatalog(InputMethods.getBoolean());
        catalogService.update(catalogShowHidden);
    }

    private static void updateCatalogForID() {
        System.out.println("Danh mục/Id hiện có : ");
        catalogService.showNameAndId();
        System.out.print("Hãy nhập ID danh mục cần chỉnh sửa : ");
        Long id = InputMethods.getLong();
        while (catalogService.findById(id) == null) {
            System.err.println("ID bạn nhập không tồn tại , hãy nhập lại ID!");
            id = InputMethods.getLong();
        }
        Catalog catalogUpdate = catalogService.findById(id);
        System.out.print("Hãy sửa tên danh mục : ");
        while (true) {
            String newCatalogName = InputMethods.getString();
            if (!catalogs.stream().anyMatch(catalog -> Objects.equals(catalog.getCatalogName(), newCatalogName))) {
                catalogUpdate.setCatalogName(newCatalogName);
                break;
            }
            System.err.println("Tên danh mục đã tồn tại !");
        }
        System.out.print("Hãy sửa mô tả danh mục : ");
        catalogUpdate.setDescriptionCatalog(InputMethods.getString());
        catalogService.update(catalogUpdate);
        System.out.println("Sửa danh mục thành công !");
    }

    private static void displayCatalog(List<Catalog> catalogList) {
        if (catalogList != null) {
            catalogList.forEach(catalog -> System.out.printf(
                    "ID : %s - CreatedDate: -%s - Name : %s - Description : %s - Show : %b \n",
                    catalog.getCatalogId(), catalog.getCreateAt(), catalog.getCatalogName(), catalog.getDescriptionCatalog(), catalog.isStatusCatalog()));
        } else {
            System.err.println("Chưa có danh mục nào !");
        }
    }

    private static void addCatalog() {
        Catalog catalog = new Catalog();
        System.out.print("Hãy nhập Id danh mục : ");
        while (true) {
            Long newId = InputMethods.getLong();
            if (!catalogs.stream().anyMatch(catalog1 -> Objects.equals(catalog1.getCatalogId(), newId))) {
                catalog.setCatalogId(InputMethods.getLong());
                break;
            }
            System.err.println("ID đã tồn tại !");
        }
        System.out.print("Hãy nhập tên danh mục : ");
        while (true) {
            String catalogName = InputMethods.getString();
            if (!catalogService.checkExistByName(catalogName)) {
                catalog.setCatalogName(catalogName);
                break;
            }
            System.err.println("Tên danh mục đã tồn tại !");
        }
        System.out.print("Hãy nhập mô tả danh mục : ");
        catalog.setDescriptionCatalog(InputMethods.getString());
        catalog.setCreateAt(LocalDateTime.now());
        System.out.println("Có hiển thị danh mục hay không ? (true/false) : ");
        catalog.setStatusCatalog(InputMethods.getBoolean());
        catalogService.create(catalog);
        System.out.println("Thêm danh mục thành công !");
    }

    // xu ly cac chuc nang cua san pham
    public static void menuProduct() {
        // lấy ra được đối tượng cần thay đổi trạng thái Catalog
        // Dùng setter để thay đổi trạng thái từ true về false
        // Lưu đối tượng vừa sửa được vào List
        do {
            System.out.println("-----Menu quản lý sản phẩm-----");
            System.out.println("1.Hiển thị danh sách sản phẩm.");
            System.out.println("2.Thêm mới 1 hoặc nhiều sản phẩm.");
            System.out.println("3.Chỉnh sửa thông tin sản phẩm.");
            System.out.println("4.Ẩn/Hiện sản phẩm theo mã sản phẩm.");
            System.out.println("5.Tìm kiếm sản phẩm theo tên .");
            System.out.println("6.Ẩn nhiều sản phẩm theo mã sản phẩm nhập vào.");
            System.out.println("0.Thoát menu quản lý sản phẩm.");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // hiển thị danh sách sản phẩm - sắp xếp theo thời gian thêm mới nhất
                    displayListProduct(productService.findAllOrderByCreatedDate());
                    break;
                case 2:
                    // yêu cầu phải tạo tồn tại danh mục trước mới có thể tạo mới sản phẩm
                    createNewProduct();
                    break;
                case 3:
                    // chỉnh sửa theo id , không chỉnh sửa trạng thái
                    updateProduct();
                    break;
                case 4:
                    //chuyển trạng thái về true / false
                    productUpdateShowHiddenForId();
                    break;
                case 5:
                    // Tìm kiếm sản phẩm theo tên
                    System.out.print("Hãy nhập tên cần tìm kiếm : ");
                    String input = InputMethods.getString();
                    List<Product> productResult = productService.findByName(input);
                    displayListProduct(productResult);
                    break;
                case 6 :
                    //Ẩn nhiều sản phẩm theo mã sản phẩm nhập vào
                    System.out.println("Sản phẩm/Id hiện có : ");
                    productService.showNameAndId();
                    Long[] idsNumber = productService.validateIds();
                    for(int i = 0 ; i < idsNumber.length ;i++){
                        Product productUpdate = productService.findById(idsNumber[i]);
                        productUpdate.setStatusProduct(false);
                        productService.update(productUpdate);
                    }
                    System.out.println("Ẩn Sản phẩm thành công !");
                    break;
                case 0:
                    return;
                default:
                    System.err.println("Hãy nhập lựa chọn từ 0 -> 5 !");
            }
        } while (true);
    }

    // chức năng hiển thị
    public static void displayListProduct(List<Product> list) {
        if (list.isEmpty()) {
            System.err.println("Danh sách không có sản phẩm nào !");
        } else {
            list.forEach(System.out::println);
        }
    }

    // chức năng thêm mới
    public static void createNewProduct() {
        //bắt người dùng nhập số lượng muốn thêm
        System.out.println("Hãy nhập số lượng sản phẩm muốn thêm : ");
        int count = InputMethods.getInteger();
        if (count <= 0) {
            System.err.println("Số lượng phải lớn hơn 0 !");
            return;
        }
        for (int i = 1; i <= count; i++) {
            System.out.println("Thêm sản phẩm thứ " + i + " :");
            Long newId = productService.getNewId();
            System.out.println("Mã sản phẩm : " + newId);
            System.out.println("Danh mục/Id hiện có : ");
            catalogService.showNameAndId();
            System.out.print("Hãy nhập ID danh mục của sản phẩm : ");
            Long catalogId = InputMethods.getLong();
            while (catalogService.findById(catalogId) == null) {
                System.err.println("ID bạn nhập không tồn tại , hãy nhập lại ID!");
                catalogId = InputMethods.getLong();
            }
            // nhập các thông tin cho sản phẩm cần thêm mới :
            Product product = new Product();
            product.setOfCatalogId(catalogId);
            product.setProductId(newId);
            System.out.print("Nhập tên sản phẩm : ");
            while (true) {
                String productName = InputMethods.getString();
                if (!productService.checkExistByName(productName) && productName.length() > 6 ) {
                    product.setProductName(productName);
                    break;
                }
                System.err.println("Tên sản phẩm phải lớn hơn 6 và không được trùng lặp !");
            }
            System.out.print("Hãy nhập mô tả sản phẩm : ");
            product.setDescriptionProduct(InputMethods.getString());
            System.out.print("Hãy nhập giá thành sản phẩm : ");
            product.setUnitPrice(InputMethods.getDouble());
            System.out.println("Hãy nhập số lượng thêm vào kho : ");
            product.setStock(InputMethods.getInteger());
            product.setCreate_at(LocalDate.from(LocalDateTime.now()));
            product.setStatusProduct(true);
            productService.create(product);
            System.out.printf("Thêm sản phẩm thứ %d thành công !\n", i);
        }
    }

    public static void updateProduct() {
        System.out.println("Sản phẩm và Id hiện có : ");
        productService.showNameAndId();
        System.out.print("Hãy nhập ID sản phẩm cần sửa : ");
        Long editId = InputMethods.getLong();
        Product productEdit = productService.findById(editId);
        if (productEdit == null) {
            System.err.println("ID sản phẩm không tồn tại");
            return;
        }
        // hiển thị giá trị cũ
        System.out.println("Thông tin sản phẩm cần sửa là :");
        System.out.println(productEdit);
        // nhập các thông tin cho sản phẩm cần thêm mới :
        while (true) {
            System.out.print("Sửa tên sản phẩm : ");
            String newProductName = InputMethods.getString();
            if (!productService.checkExistByName(newProductName)) {
                productEdit.setProductName(newProductName);
                break;
            }
            System.err.println("Tên sản phẩm đã tồn tại !");
        }
        System.out.print("Hãy nhập mô tả sản phẩm : ");
        productEdit.setDescriptionProduct(InputMethods.getString());
        System.out.print("Hãy nhập giá thành sản phẩm : ");
        productEdit.setUnitPrice(InputMethods.getDouble());
        System.out.println("Hãy nhập số lượng thêm vào kho : ");
        productEdit.setStock(InputMethods.getInteger());
        productEdit.setUpdate_at(LocalDate.now());
        productEdit.setStatusProduct(true);
        productService.update(productEdit);
        System.out.printf("Sửa thành công sản phẩm ID %d \n!", editId);
    }

    private static void productUpdateShowHiddenForId() {
        System.out.println("Sản phẩm và Id hiện có : ");
        productService.showNameAndId();
        System.out.print("Hãy nhập ID Sản phẩm cần chỉnh sửa : ");
        Long id = InputMethods.getLong();
        while (productService.findById(id) == null) {
            System.err.println("ID bạn nhập không tồn tại , hãy nhập lại ID!");
            id = InputMethods.getLong();
        }
        Product productShowHidden = productService.findById(id);
        System.out.print("Hãy nhập Ẩn/Hiện danh mục (true/false) : ");
        productShowHidden.setStatusProduct(InputMethods.getBoolean());
        productService.update(productShowHidden);
        System.out.println("Chỉnh sửa thành công !");
    }
}
