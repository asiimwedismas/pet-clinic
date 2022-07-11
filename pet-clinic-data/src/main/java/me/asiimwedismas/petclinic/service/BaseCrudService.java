package me.asiimwedismas.petclinic.service;

import java.util.Set;

public interface BaseCrudService<T, ID> {
    T findById(ID id);
    T save(T object);
    Set<T> findAll();
    void delete(T object);
    void deleteById(ID id);
}
