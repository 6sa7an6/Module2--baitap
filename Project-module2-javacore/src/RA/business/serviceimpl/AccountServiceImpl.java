package RA.business.serviceimpl;

import RA.business.entity.account.User;
import RA.business.run.Customer;
import RA.business.run.Home;
import RA.business.service.IAccountService;
import RA.util.IOFile;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static RA.business.run.Home.isLogin;

public class AccountServiceImpl implements IAccountService {
    public static List<User> userList;
    public AccountServiceImpl() {
        userList = Customer.userList;
    }

    @Override
    public void resign(User u) {
        userList.add(u);
        IOFile.writeToFile(IOFile.USER_PATH,userList);
    }

    @Override
    public Long getNewId() {
        Long idMax = 0L;
        for (User u : userList){
            if(idMax<u.getId()){
                idMax = u.getId();
            }
        }
        return idMax+1;
    }

    @Override
    public boolean checkExistByName(String t) {
        return userList.stream().anyMatch(user -> Objects.equals(user.getUsername(), t));
    }

    @Override
    public Optional<User> findByName(String t) {
        return userList.stream().filter(user -> user.getUsername().toLowerCase().contains(t.toLowerCase())).findFirst();
    }

    @Override
    public void logOut() {
        IOFile.writeToFile(IOFile.ISLOGIN_PATH,new ArrayList<>());
        System.out.println("Đăng xuất thành công !");
    }

    @Override
    public List<User> findAll() {
        if(!userList.isEmpty()){
            return userList;
        }
        return null;
    }

    @Override
    public void setAdmin() {
        if(userList.stream().filter(user -> Objects.equals(user.getUsername(), "admin")).count()==0){
            User admin = new User(0L,"admin","admin",true);
            resign(admin);
        }
    }

    @Override
    public void update(User user) {
        user.setUpdateAt(LocalDateTime.now());
        userList.set(userList.indexOf(user),user);
        IOFile.writeToFile(IOFile.USER_PATH,userList);
    }


    @Override
    public User findUserByOnline() {
        return isLogin.stream().findFirst().orElse(null);
    }
}
