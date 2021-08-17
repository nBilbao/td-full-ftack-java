package com.nbilbao.productsAndCategory.services;

import com.nbilbao.productsAndCategory.models.CategoryProduct;
import com.nbilbao.productsAndCategory.repositories.CategoryProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryProductService{

    @Autowired
    CategoryProductRepository categoryProductRepository;

    public void updateCategoryProduct(CategoryProduct almacen) {
        categoryProductRepository.save(almacen);

    }
}
