package com.example.basicspringbootapi.store.service;

import com.example.basicspringbootapi.store.entities.Store;

import java.util.List;

public interface IStoreService {
    List<Store> findAll();
    void addStore(Store product);
    void deleteStore(Long id);
    void updateStore(Store product, Long id);
    Store getStore(Long id);
}
