package com.example.product.Services;

import com.example.product.Entities.Product;

import java.util.List;

public interface IProduct4Service {


    public void Save(Product product);
    public void Update(Product product, Long id);

    public List<Product> getAll();
    public Product getById(Long id);

}
