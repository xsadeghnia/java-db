package dao;

import entity.Entity;

import java.util.List;

public class DbDao<T extends Entity> implements Dao<T> {
    @Override
    public void insert(T t) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public T getById(int id) {
        return null;
    }

    @Override
    public List<T> getAll() {
        return null;
    }
}
