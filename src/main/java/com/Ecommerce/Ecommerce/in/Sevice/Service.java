package com.Ecommerce.Ecommerce.in.Sevice;


import com.Ecommerce.Ecommerce.in.Entitiy.Cart;
import com.Ecommerce.Ecommerce.in.Repo.ProductRepo;
import com.Ecommerce.Ecommerce.in.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public interface Service extends UserRepo {
    public Cart saveDepartment(Cart cart);

    ThreadLocal<Object> findById(int id);
}
