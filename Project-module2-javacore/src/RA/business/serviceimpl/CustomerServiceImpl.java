package RA.business.serviceimpl;

import RA.business.entity.Product;
import RA.business.entity.account.OrdersDetail;
import RA.business.entity.account.User;
import RA.business.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static RA.business.serviceimpl.AccountServiceImpl.userList;

public class CustomerServiceImpl implements ICustomerService {
    @Override
    public List<OrdersDetail> findAll(User user) {
        if(user.getCarts()!=null){
            return user.getCarts();
        }
        return new ArrayList<>();
    }

    @Override
    public Long getNewID(User user) {
        Long idMax = 0L;
        if (findAll(user) == null) {
            return 1L;
        }else {
            for (OrdersDetail o : findAll(user)) {
                if (idMax < o.getOrderId()) {
                    idMax = o.getOrderId();
                }
            }
            return idMax + 1;
        }
    }


    @Override
    public void showAllForCustomer(Stream<Product> products) {
        products.forEach(product -> System.out.printf("ID : %s  - Name : %s - Price : %s \n",
                product.getProductId(), product.getProductName(), product.getUnitPrice()));
    }
}
