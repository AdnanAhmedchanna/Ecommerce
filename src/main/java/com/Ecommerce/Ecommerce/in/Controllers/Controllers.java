package com.Ecommerce.Ecommerce.in.Controllers;


import com.Ecommerce.Ecommerce.in.Entitiy.Cart;
import com.Ecommerce.Ecommerce.in.Entitiy.Products;
import com.Ecommerce.Ecommerce.in.Repo.ProductRepo;
import com.Ecommerce.Ecommerce.in.Repo.UserRepo;
import com.Ecommerce.Ecommerce.in.Sevice.Service;
import com.Ecommerce.Ecommerce.in.Sevice.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.Optional;

@RestController
public class Controllers {
    @Autowired
    public Service service;
    @Autowired
    public Products products;
    public Cart cart;

    @Autowired
    public UserRepo userRepo;

    @GetMapping("/products/{id}")
    private String findById(@PathVariable("id") int id){
       return service.findById(id).get().toString();

}
    @RestController("/cart")
    public class CartController{

        @PutMapping("/carts")
        public Cart saveCart(@RequestBody Cart cart){
           service.saveDepartment(cart);
           return cart;
        }

    }
}
