package dao;

import entity.Entity;

import java.util.List;

public interface Dao <T extends Entity> {
    void insert(T t);
    void update(T t);
    void delete(int id);
    T getById(int id);
    List<T> getAll();

}
