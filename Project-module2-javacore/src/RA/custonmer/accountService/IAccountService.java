package RA.custonmer.accountService;

import RA.custonmer.account.User;

public interface IAccountService {
    void resign(User u);
    void login();
    void logout();
    Long getNewId();

}
