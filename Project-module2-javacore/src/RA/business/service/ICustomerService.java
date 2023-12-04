package RA.business.service;

import RA.business.entity.Product;
import RA.business.entity.account.OrdersDetail;
import RA.business.entity.account.User;

import java.util.List;
import java.util.stream.Stream;

public interface ICustomerService {
    List<OrdersDetail> findAll(User user);
    Long getNewID(User user);
    void showAllForCustomer(Stream<Product> products);
}
