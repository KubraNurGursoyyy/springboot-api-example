package com.example.basicspringbootapi.store.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.basicspringbootapi.store.entities.Store;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<Store,Long>{
}
