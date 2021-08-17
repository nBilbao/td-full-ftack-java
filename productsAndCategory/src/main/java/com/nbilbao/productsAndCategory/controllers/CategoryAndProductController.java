package com.nbilbao.productsAndCategory.controllers;

import com.nbilbao.productsAndCategory.models.Category;
import com.nbilbao.productsAndCategory.models.CategoryProduct;
import com.nbilbao.productsAndCategory.models.Product;
import com.nbilbao.productsAndCategory.services.CategoryProductService;
import com.nbilbao.productsAndCategory.services.CategoryService;
import com.nbilbao.productsAndCategory.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CategoryAndProductController {

    @Autowired
    CategoryService categoryService;
    @Autowired
    ProductService productService;
    @Autowired
    CategoryProductService categoryProductService;


    @RequestMapping("/products")
    public String product(Model model){
        List<Product> products = productService.allProducts();
        model.addAttribute("products", products);

        return "index_products.jsp";
    }
    @RequestMapping("/products/new")
    public String addProduct(@ModelAttribute("products")Product products){

        return "/new_product.jsp";
    }

    @RequestMapping(value = "/products/new",method = RequestMethod.POST)
    public String addProduct(@Valid @ModelAttribute("products")Product products, BindingResult result){
        if (result.hasErrors()) {
            return "/new_product.jsp";
        } else {
            productService.createProduct(products);
            return "redirect:/products";
        }
    }

    @RequestMapping("/categories")
    public String category(Model model){

        List<Category> categories = categoryService.allCategories();
        model.addAttribute("categories",categories);

        return "index_categories.jsp";

    }
    @RequestMapping("/categories/new")
    public String newCategory(@ModelAttribute("categories")Category categories){
        return "/new_category.jsp";
    }

    @RequestMapping(value = "/categories/new", method = RequestMethod.POST)
    public String newCategory(@Valid @ModelAttribute("categories")Category categories, BindingResult result){
        if (result.hasErrors()) {
            return "/new_category.jsp";
        } else {
            categoryService.createProduct(categories);
            return "redirect:/categories";
        }
    }

    @RequestMapping("/categories/{id}")
    public String showCategories(@PathVariable("id")Long id, Model model){
        Category categories = categoryService.findCategory(id);
        List<Product> allProducts = productService.allProducts();
        CategoryProduct almacen = new CategoryProduct();


        model.addAttribute("categories",categories);
        model.addAttribute("allProducts",allProducts);
        model.addAttribute("almacen",almacen);


        return "/show_categories.jsp";

    }
    @RequestMapping(value="/categories/{id}", method=RequestMethod.POST)
    public String update(@Valid @ModelAttribute("product") Product producto, BindingResult result,@PathVariable("id")Long idCategory,Model model) {
        Category category =   categoryService.findCategory(idCategory);
        Product objProduct = productService.getProductById(producto.getId());
        CategoryProduct almacen = new CategoryProduct();
        almacen.setCategory(category);
        almacen.setProduct(objProduct);




        if (result.hasErrors()) {
            return "/categories/{id}";
        } else {

            categoryProductService.updateCategoryProduct(almacen);
            return "redirect:/categories";
        }

    }
}
