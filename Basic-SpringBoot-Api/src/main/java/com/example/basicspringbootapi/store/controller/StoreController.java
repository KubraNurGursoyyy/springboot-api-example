package com.example.basicspringbootapi.store.controller;

import com.example.basicspringbootapi.store.entities.Store;
import com.example.basicspringbootapi.store.service.IStoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/product/")
public class StoreController {
    private final IStoreService storeService;

    public StoreController(IStoreService storeService) {
        this.storeService = storeService;
    }

    @PostMapping(value = "add")
    public ResponseEntity AddProduct(@RequestBody Store store){
        storeService.addStore(store);
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "delete/{id}")
    public ResponseEntity DeleteProduct(@PathVariable("id") Long id){
        storeService.deleteStore(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value = "update/{id}")
    public ResponseEntity UpdateProduct(@PathVariable("id") Long id, @RequestBody Store store){
        storeService.updateStore(store,id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "get/{id}")
    public ResponseEntity<Store> GetProduct(@PathVariable("id") Long id){
        return ResponseEntity.ok(storeService.getStore(id));
    }

    @GetMapping(value = "get")
    public ResponseEntity<List<Store>> GetProduct(){
        return ResponseEntity.ok(storeService.findAll());
    }
}
