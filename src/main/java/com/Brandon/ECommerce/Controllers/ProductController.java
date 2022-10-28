package com.Brandon.ECommerce.Controllers;


import com.Brandon.ECommerce.Models.Product;
import com.Brandon.ECommerce.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product") //where all endpoints come from
@CrossOrigin()
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping //verb then map it to an endpoint
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id")int id){
        return productService.getProductById(id);
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        product.setId(0);
        return productService.save(product);
    }




}
