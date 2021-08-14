package com.nbilbao.productsAndCategory.services;

import com.nbilbao.productsAndCategory.models.Category;
import com.nbilbao.productsAndCategory.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }

    public void createProduct(Category categories) {
        categoryRepository.save(categories);
    }

    public Category findCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }
}
