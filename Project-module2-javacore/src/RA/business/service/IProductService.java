package RA.business.service;

import RA.business.dao.IGenericDao;
import RA.business.entity.Catalog;
import RA.business.entity.Product;

import java.util.List;

public interface IProductService extends IGenericService<Product,Long> {
    Long getNewId();
    List<Product> sortByPrice();
}
