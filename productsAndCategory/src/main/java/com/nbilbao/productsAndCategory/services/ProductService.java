package com.nbilbao.productsAndCategory.services;

import com.nbilbao.productsAndCategory.models.Product;
import com.nbilbao.productsAndCategory.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> allProducts(){
        return productRepository.findAll();
    }

    public void createProduct(Product products) {
        productRepository.save(products);
    }
}
