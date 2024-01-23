package com.Ecommerce.Ecommerce.in.Repo;

import com.Ecommerce.Ecommerce.in.Entitiy.Products;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Integer, Id> {

}

