package com.nbilbao.productsAndCategory.repositories;

import com.nbilbao.productsAndCategory.models.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {

    List<Category> findAll();
}
