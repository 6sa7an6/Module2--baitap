package RA.business.dao;

import java.util.List;

public interface IGenericDao<T , E> {
    List<T> findAll();
    T findbyId(E id);
    void add (T t);
    void update (T t);
    List<T> findByName(String t);
    void showNameAndId();
    E[] validateIds();

}
