package com.Ecommerce.Ecommerce.in.Controllers;


import com.Ecommerce.Ecommerce.in.Entitiy.Products;
import com.Ecommerce.Ecommerce.in.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.Optional;

@RestController
public class Controllers {
    @Autowired
    public Provider.Service service;
    @Autowired
    public Repo repo;
    @Autowired
    public Products products;

    @GetMapping("/products/{product_name}")
    private String getProductByName(@PathVariable String product_name){
        Optional<Long> productsOptional = repo.findById(products);

        if (productsOptional.isPresent()){
            Long products = productsOptional.get();
            return "Product is found" + products.toString();

        }
        else {
            return "Product not found";
        }

}
    @RestController("/cart")
    public class CartController{

    }
}
