package com.example.product.Repostories;

import com.example.product.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product4Repostory extends JpaRepository<Product, Long> {

}
