package RA.custonmer.accountServiceImpl;

import RA.custonmer.account.User;
import RA.custonmer.accountService.IAccountService;
import RA.util.IOFile;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    public static List<User> userList;

    public AccountServiceImpl() {
        userList = IOFile.getListFromFile(IOFile.USER_PATH);
    }

    @Override
    public void resign(User u) {
        userList.add(u);

    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public Long getNewId() {
        return null;
    }
}
