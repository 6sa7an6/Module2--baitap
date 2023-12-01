package RA.business.service;

import RA.business.entity.Catalog;

import java.util.List;

public interface IGenericService <T,E>{
    List<T> findAllOrderByCreatedDate();
    void create(T t);
    void update(T t);
    T findById(E id);
    boolean checkExistByName(String t);
    List<T> findByName(String t);
    void showNameAndId();
    Long[] validateIds();
}
