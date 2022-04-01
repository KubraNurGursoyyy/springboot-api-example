package com.example.basicspringbootapi.store.service.Impl;

import com.example.basicspringbootapi.store.entities.Store;
import com.example.basicspringbootapi.store.repository.StoreRepository;
import com.example.basicspringbootapi.store.service.IStoreService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService implements IStoreService {

    StoreRepository repository;

    @Override
    public void addStore(Store store) {
        repository.save(store);
    }

    @Override
    public void deleteStore(Long id) {
        repository.deleteById(id);
    }

    public void updateStore(Store store, Long id) {
        repository.deleteById(id);
        repository.save(store);
    }

    public Store getStore(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Store> findAll() {
        return (List<Store>) repository.findAll();
    }


}
