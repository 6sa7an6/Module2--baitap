package RA.business.run;

import RA.business.entity.account.OrdersDetail;
import RA.business.entity.account.User;
import RA.business.entity.Product;
import RA.business.service.IAccountService;
import RA.business.service.ICustomerService;
import RA.business.serviceimpl.AccountServiceImpl;
import RA.business.serviceimpl.CustomerServiceImpl;
import RA.util.EmailValidate;
import RA.util.IOFile;
import RA.util.InputMethods;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static RA.business.run.StoreManager.catalogService;
import static RA.business.run.StoreManager.productService;

public class Customer {
    public static ICustomerService customerService = new CustomerServiceImpl();
    public static List<Product> products = IOFile.getListFromFile(IOFile.PRODUCT_PATH);
    public static List<User> userList = IOFile.getListFromFile(IOFile.USER_PATH);
    public static IAccountService accountService = new AccountServiceImpl();

    public static void CustomerManager() {
        while (true) {
            System.out.println("------Menu------");
            System.out.println("1.Tìm kiếm sản phẩm .");
            System.out.println("2.Hiển thị sản phẩm nổi bật .");
            System.out.println("3.Hiển thị từng nhóm sản phẩm theo danh mục");
            System.out.println("4.Danh sách sản phẩm .");
            System.out.println("5.Hiển thị danh sách sắp xếp theo giá.");
            System.out.println("6.Thêm vào giỏ hàng.");
            System.out.println("7.Trang thông tin cá nhân .");
            System.out.println("8.Giỏ hàng của bạn . ");
            System.out.println("0.Đăng xuất.");
            System.out.println("-------------------------");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    System.out.println("-----------------------");
                    // tìm sản phẩm theo tên sản phẩm phải có trạng thái là true và danh mục cũng trạng thái true
                    findProductByName();
                    break;
                case 2:
                    // hiển thị 10 sản phẩm rẻ nhất
                    System.out.println("-----------------------");
                    showSuggestProduct();
                    break;
                case 3:
                    System.out.println("-----------------------");
                    System.out.println("Danh mục/ID hiện có : ");
                    catalogService.showNameAndId();
                    System.out.print("Hãy nhập ID danh mục muốn hiển thị : ");
                    Long id = InputMethods.getLong();
                    showProductByCatalogId(id);
                    break;
                case 4:
                    System.out.println("-----------------------");
                    showAllProduct();
                    break;
                case 5:
                    System.out.println("-----------------------");
                    showAllProductByPrice(products);
                    break;
                case 6:
                    // Thêm vào giỏ hàng
                    System.out.println("-----------------------");
                    addCart();
                    break;
                case 7 :
                    inforUser();
                    break;
                case 8 :
                    // Xu ly gio hang
                    Order();
                    break;
                case 0:
                    accountService.logOut();
                    return;
                default:
                    System.err.println("Hãy nhập từ 0 -> 6 !");
            }
        }
    }

    private static void Order() {
        while(true) {
            System.out.println("1.Kiểm tra giỏ hàng .");
            System.out.println("2.Thanh toán .");
            System.out.println("0.Quay lại menu .");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            byte choice1 = InputMethods.getByte();
            switch (choice1){
                case 1 :
                    // show gio hang
                    System.out.println("--------Giỏ hàng của bạn-------");
                    User thisUser = accountService.findUserByOnline();
                    thisUser.getCarts().forEach(System.out::println);
                    break;
                case 2 :
                    // Thanh toan
                    System.out.println("Thanh toán thành công !");
                    break;
                case 0 :
                    return;
                default:
                    System.err.println("Hãy nhập từ 0 -> 2");
            }
        }
    }

    private static void inforUser() {
        while (true){
            System.out.println("---------Thông tin cá nhân---------");
            System.out.println("1.Đổi mật khẩu .");
            System.out.println("2.Hiển thị thông tin cá nhân .");
            System.out.println("3.Chỉnh sửa thông tin cá nhân .");
            System.out.println("0.Trở về menu mua hàng .");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            byte choice1 = InputMethods.getByte();
            switch (choice1){
                case 1 :
                    User changePassword = accountService.findUserByOnline();
                    System.out.println("Hãy nhập mật khẩu mới : ");
                    changePassword.setPassword(InputMethods.getString());
                    accountService.update(changePassword);
                    System.out.println("Đổi mật khẩu thành công !");
                    break;
                case 2 :
                    User user = accountService.findUserByOnline();
                    if(user != null){
                        System.out.printf(
                                "ID : %s - userName: -%s - Password : %s - fullName : %s - email : %s - createAt : %s - \n",
                                user.getId(),user.getUsername(),user.getPassword(),user.getFullName(),user.getEmail(),user.getCreateAt());}
                    break;
                case 3 :
                    System.out.println("--------------------");
                    User newUser = accountService.findUserByOnline();
                    System.out.print("Nhập UserName mới : ");
                    newUser.setUsername(InputMethods.getString());
                    System.out.print("Nhập Email mới : ");
                    while (true){
                        String newEmail = InputMethods.getString();
                        if(EmailValidate.validateEmail(newEmail)){
                            newUser.setEmail(newEmail);
                            break;
                        }
                        System.err.println("Email không hợp lệ !");
                    }
                    System.out.print("Nhập họ tên mới : ");
                    newUser.setFullName(InputMethods.getString());
                    accountService.update(newUser);
                    System.out.println("Đổi thông tin thành công !.");
                    break;
                case 0 :
                    return;
                default:
                    System.err.println("Hãy nhập từ 0 -> 3 !");
            }
        }
    }

    private static void showAllProductByPrice(List<Product> products) {
        while (true) {
        System.out.println("1.Tăng dần .");
        System.out.println("2.Giảm dần .");
        System.out.println("0.Quay lại .");
        System.out.print("Hãy nhập lựa chọn của bạn : ");
        byte choice1 = InputMethods.getByte();
        switch (choice1) {
            case 1:
                customerService.showAllForCustomer(products.stream().filter(product -> product.isStatusProduct() && catalogService.findById(product.getOfCatalogId()).isStatusCatalog()).sorted((o1, o2) -> Double.compare(o1.getUnitPrice(), o2.getUnitPrice())));
                break;
            case 2:
                customerService.showAllForCustomer(products.stream().filter(product -> product.isStatusProduct() && catalogService.findById(product.getOfCatalogId()).isStatusCatalog()).sorted((o1, o2) -> Double.compare(o2.getUnitPrice(), o1.getUnitPrice())));
                break;
            case 0:
                return;
            default:
                System.err.println("Hãy nhập từ 0 -> 2 !");
        }
}
    }

    private static void showAllProduct() {
        System.out.println("Sản phẩm hiện có : ");
        customerService.showAllForCustomer(products.stream().filter(product -> product.isStatusProduct() && catalogService.findById(product.getOfCatalogId()).isStatusCatalog()));
    }

    private static void showProductByCatalogId(Long id) {
        System.out.println("Sản phẩm thuộc danh mục này là : ");
        customerService.showAllForCustomer(products.stream().filter(catalog -> Objects.equals(catalog.getOfCatalogId(), id)).filter(product -> product.isStatusProduct() && catalogService.findById(product.getOfCatalogId()).isStatusCatalog()));
    }

    private static void showSuggestProduct() {
        List<Product> productList = productService.sortByPrice().stream().filter(product -> product.isStatusProduct() && catalogService.findById(product.getOfCatalogId()).isStatusCatalog()).collect(Collectors.toList());
        if (productList.size() > 10) {
            for (int i = 9; i >= 0; i--) {
                System.out.println("[ID sản phầm : " + productList.get(i).getProductId() + " / " + "Tên sản phẩm : " + productList.get(i).getProductName() + " / " + "Giá sản phầm : " + productList.get(i).getUnitPrice() + "]");
            }
        } else {
            for (int i = productList.size()-1; i >= 0; i--) {
                System.out.println("[ID sản phầm : " + productList.get(i).getProductId() + " / " + "Tên sản phẩm : " + productList.get(i).getProductName() + " / " + "Giá sản phầm : " + productList.get(i).getUnitPrice() + "]");
            }
        }
    }

    private static void findProductByName() {
        System.out.print("Hãy nhập tên sản phẩm muốn tìm kiếm thông tin : ");
        String productName = InputMethods.getString();
        customerService.showAllForCustomer(productService.findByName(productName).stream().filter(product -> product.isStatusProduct() && catalogService.findById(product.getOfCatalogId()).isStatusCatalog()));
        return;
    }

    private static void addCart() {
        User thisUser = accountService.findUserByOnline();
        System.out.print("Hãy nhập ID sản phẩm muốn mua : ");
        Long buyId = InputMethods.getLong();
        if (productService.findById(buyId) == null) {
            System.err.println("Không có sản phẩm này");
            return;
        }
        Product buyProduct = productService.findById(buyId);
        OrdersDetail cart = new OrdersDetail();
        cart.setProductId(buyId);
        if (thisUser != null) {
            cart.setOrderId(customerService.getNewID(thisUser));
        } else {
            System.err.println("Bạn phải đăng nhập trước khi mua  !");
            return;
        }
        System.out.print("Hãy nhập số lượng muốn mua : ");
        cart.setQuantity(InputMethods.getInteger());
        cart.setName(buyProduct.getProductName());
        cart.setUnitPrice(buyProduct.getUnitPrice());
        List<OrdersDetail> order = customerService.findAll(thisUser);
        order.add(cart);
        thisUser.setCarts(order);
        userList.add(thisUser);
        IOFile.writeToFile(IOFile.USER_PATH, userList);
    }
}
