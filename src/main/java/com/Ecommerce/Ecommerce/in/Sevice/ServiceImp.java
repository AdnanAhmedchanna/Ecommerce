package com.Ecommerce.Ecommerce.in.Sevice;


import com.Ecommerce.Ecommerce.in.Entitiy.Cart;
import jakarta.persistence.Id;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public  interface ServiceImp extends Service {
    public Cart saveDepartment(Cart cart);
    public  Cart deleteCart();

    public List<Cart> getCart();

}
