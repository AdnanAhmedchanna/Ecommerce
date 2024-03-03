package com.Ecommerce.Ecommerce.in.Repo;

import com.Ecommerce.Ecommerce.in.Entitiy.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo<id> extends JpaRepository<id, Integer> {

}

