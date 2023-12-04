package RA.business.service;

import RA.business.entity.account.User;

import java.util.List;
import java.util.Optional;

public interface IAccountService {
    void resign(User u);
    Long getNewId();
    boolean checkExistByName(String t);
    Optional<User> findByName(String t);
    void logOut();
    List<User> findAll();
    void setAdmin();
    void update(User user);
    User findUserByOnline();
}
