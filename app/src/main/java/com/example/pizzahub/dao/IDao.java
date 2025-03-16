package com.example.pizzahub.dao;

import java.util.List;

public interface IDao<T > {
    boolean create(T t);

    boolean delete(T t);

    List<T> findAll();

    T findById(int i);

    boolean update(T t);
}
