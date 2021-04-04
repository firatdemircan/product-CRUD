package com.example.product.impl;

import com.example.product.Entities.Product;
import com.example.product.Repostories.ProductRepostory;
import com.example.product.Services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService implements IProductService {

    @Autowired
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

    @Override
    public void deleteProductById(Long id) {
        productRepostory.deleteById(id);

    }


}
