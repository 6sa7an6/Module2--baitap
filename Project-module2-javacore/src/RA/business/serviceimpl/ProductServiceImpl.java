package RA.business.serviceimpl;

import RA.business.dao.IProductDao;
import RA.business.daoimpl.ProductDaoImpl;
import RA.business.entity.Product;
import RA.business.service.IProductService;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static RA.business.daoimpl.CatalogDaoImpl.catalogs;
import static RA.business.daoimpl.ProductDaoImpl.products;

public class ProductServiceImpl implements IProductService {

    private static IProductDao productDao = new ProductDaoImpl();

    @Override
    public List<Product> findAllOrderByCreatedDate() {
        return productDao.findAll().stream()
                .sorted((o1, o2) -> o1.getCreate_at().compareTo(o2.getCreate_at()))
                .collect(Collectors.toList());
    }

    @Override
    public boolean checkExistByName(String t) {
        return products.stream().anyMatch(product -> Objects.equals(product.getProductName(), t));
    }

    @Override
    public List<Product> findByName(String t) {
        return productDao.findByName(t);
    }

    @Override
    public Product findById(Long id) {
        return productDao.findbyId(id);
    }

    @Override
    public void create(Product p) {
        productDao.add(p);
    }

    @Override
    public void update(Product p) {
        productDao.update(p);
    }

    @Override
    public Long getNewId() {
        Long idMax = 0L;
        for (Product p:productDao.findAll()){
            if(idMax<p.getProductId()){
                idMax = p.getProductId();
            }
        }
        return idMax+1;
    }

    @Override
    public void showNameAndId() {
        productDao.showNameAndId();
    }

    @Override
    public Long[] validateIds() {
        return productDao.validateIds();
    }
}
