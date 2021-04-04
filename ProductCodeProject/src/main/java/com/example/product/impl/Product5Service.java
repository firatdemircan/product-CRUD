package com.example.product.impl;

import com.example.product.Entities.Product;
import com.example.product.Repostories.ProductRepostory;
import com.example.product.Services.IProduct5Service;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class Product5Service implements IProduct5Service {

    ProductRepostory productRepostory;

    @Override
    public void Save(Product product) {
        productRepostory.save(product);
    }

    @Override
    public void Update(Product product, Long id) {
        Product productdb =productRepostory.getOne(id);
        //productdb.setname(product)
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = productRepostory.findAll();
        return products;
    }

    @Override
    public Product getById(Long id) {
        Product product = productRepostory.getOne(id);
        return product;
    }
}
