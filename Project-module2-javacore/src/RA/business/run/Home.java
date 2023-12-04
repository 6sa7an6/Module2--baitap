package RA.business.run;

import RA.business.run.StoreManager;
import RA.business.service.IAccountService;
import RA.business.serviceimpl.AccountServiceImpl;
import RA.business.run.Customer;
import RA.util.EmailValidate;
import RA.util.IOFile;
import RA.util.InputMethods;
import RA.business.entity.account.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static RA.business.run.Customer.accountService;
import static RA.business.run.Customer.userList;

public class Home {
    public static List<User> isLogin;

    public static void main(String[] args) {
        accountService.setAdmin();
        while (true) {
            isLogin = IOFile.getListFromFile(IOFile.ISLOGIN_PATH);
            System.out.println("------Trang chủ-----");
            System.out.println("1.Đăng nhập.");
            System.out.println("2.Đăng ký.");
            System.out.println("0.Thoát.");
            System.out.print("Hãy nhập lựa chọn của bạn : ");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // dang nhap
                    while (true) {
                        System.out.print("Hãy nhập tên đăng nhập : ");
                        String userName = InputMethods.getString();
                        System.out.print("Hãy nhập mật khẩu : ");
                        String password = InputMethods.getString();
                        Optional<User> foundUser = userList.stream().filter(user -> Objects.equals(user.getUsername(), userName)).findFirst();
                        if (foundUser.isPresent()) {
                            User user = foundUser.get();
                            if (Objects.equals(user.getPassword(), password)) {
                                System.out.println("Đăng nhập thành công !");
                                System.out.println("Xin chào " + user.getUsername());
                                if (user.isRole()) {
                                    isLogin.add(user);
                                    IOFile.writeToFile(IOFile.ISLOGIN_PATH, isLogin);
                                    StoreManager.adminManager();
                                    break;
                                } else {
                                    isLogin.add(user);
                                    IOFile.writeToFile(IOFile.ISLOGIN_PATH, isLogin);
                                    Customer.CustomerManager();
                                    break;
                                }
                            } else {
                                System.err.println("Mật khẩu không đúng !");
                            }
                        } else {
                            System.err.println("Tên đăng nhập không tồn tại !");
                        }
                    }
                    break;
                case 2:
                    // dang ky
                    User user = new User();
                    user.setId(accountService.getNewId());
                    System.out.print("Hãy nhập tên đăng nhập : ");
                    while (true) {
                        String input = InputMethods.getString();
                        if (!accountService.checkExistByName(input)) {
                            user.setUsername(input);
                            break;
                        }
                        System.err.println("Tên đăng nhập đã tồn tại !");
                    }
                    System.out.print("Hãy nhập email : ");
                    while (true) {
                        String email = InputMethods.getString();
                        if (EmailValidate.validateEmail(email)) {
                            user.setEmail(email);
                            break;
                        }
                        System.err.println("Email không hợp lệ !");
                    }
                    System.out.print("Hãy nhập họ tên : ");
                    user.setFullName(InputMethods.getString());
                    System.out.print("Hãy nhập mật khẩu : ");
                    user.setPassword(InputMethods.getString());
                    user.setRole(false);
                    user.setStatus(true);
                    user.setCreateAt(LocalDateTime.now());
                    accountService.resign(user);
                    System.out.println("Đăng ký thành công !");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.err.println("Hãy nhập từ 0 -> 2 ");
                    break;
            }
        }
    }
}
