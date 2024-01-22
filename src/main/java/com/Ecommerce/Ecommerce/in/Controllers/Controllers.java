package com.Ecommerce.Ecommerce.in.Controllers;


import com.Ecommerce.Ecommerce.in.Entitiy.Products;
import com.Ecommerce.Ecommerce.in.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

        @PutMapping
        public ResponseEntity<String> saveProducts(@RequestBody Products products){
            try {
                repo.save(products);
                return ResponseEntity.ok("Product saved succesasfully");
            }
            catch (Exception e){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal error occured");
            }
        }

    }
}
