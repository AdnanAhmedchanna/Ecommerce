package com.Ecommerce.Ecommerce.in.Repo;

import com.Ecommerce.Ecommerce.in.Entitiy.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Long, Products> {

}

