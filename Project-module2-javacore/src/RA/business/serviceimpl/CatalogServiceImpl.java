package RA.business.serviceimpl;

import RA.business.dao.ICatalogDao;
import RA.business.daoimpl.CatalogDaoImpl;
import RA.business.entity.Catalog;
import RA.business.service.ICatalogService;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static RA.business.daoimpl.CatalogDaoImpl.catalogs;

public class CatalogServiceImpl implements ICatalogService{
    private static ICatalogDao catalogDao = new CatalogDaoImpl();
    @Override
    public List<Catalog> findAllOrderByCreatedDate() {
        if (catalogDao.findAll()!=null){
            return catalogDao.findAll().stream().sorted((o1, o2) -> o2.getCreateAt().compareTo(o1.getCreateAt())).collect(Collectors.toList());
        }
        return null;
    }

    @Override
    public void create(Catalog catalog) {
        catalogDao.add(catalog);
    }

    @Override
    public void update(Catalog catalog) {
        catalogDao.update(catalog);
    }

    @Override
    public boolean checkExistByName(String t) {
        return catalogs.stream().anyMatch(catalog1 -> Objects.equals(catalog1.getCatalogName(), t));
    }

    @Override
    public List<Catalog> findByName(String t) {
        return catalogDao.findByName(t);
    }

    @Override
    public Catalog findById(Long id) {
        return catalogDao.findbyId(id);
    }

    @Override
    public void showNameAndId() {
        catalogDao.showNameAndId();
    }

    @Override
    public Long[] validateIds() {
        return catalogDao.validateIds();
    }
}
