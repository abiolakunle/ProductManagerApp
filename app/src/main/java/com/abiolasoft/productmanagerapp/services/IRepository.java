package com.abiolasoft.productmanagerapp.services;

import java.util.List;

public interface IRepository<T> {

    void add(T item);

    T get(int id);

    List<T> getAll();

    void update(T item);

    void remove(int id);
}
