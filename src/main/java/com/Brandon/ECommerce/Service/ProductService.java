package com.Brandon.ECommerce.Service;


import com.Brandon.ECommerce.Models.Product;
import com.Brandon.ECommerce.Repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    private ProductRepository productRepo;
    //Best Practice: when required dependencies exist in a service, declare it in constructor

    public ProductService(ProductRepository productRepo){
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int id) {
        return productRepo.findById(id).get();
    }


    public Product save(Product product) {
        return productRepo.save(product);
    }
}
