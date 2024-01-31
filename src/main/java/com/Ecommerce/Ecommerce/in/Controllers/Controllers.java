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
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class Controllers {
    @Autowired
    public Service service;
    @Autowired
    public Products products;
    @Autowired
    public Cart cart;

    @Autowired
    public UserRepo userRepo;

    @GetMapping("/products/{id}")
    private String findById(@PathVariable("id") int id){
       return service.findById(id).get().toString();

}
    @RestController
    @RequestMapping("/Cart")
    public class CartController{

        @PutMapping("/cart/{id}")
        public String saveCart(@PathVariable("id") int id){
           service.save(id);
           return "/redirect/cart";
        }

        @DeleteMapping("/Checkout")
        public String deleteCart(){
            List<Cart> cart = new ArrayList<>();
            service.deleteAll(cart);
            return "/redirect:Checkout";

        }
        @GetMapping("/cart")
        public List<Cart> getCart(){
            return service.findAll(cart);

        }


    }

}