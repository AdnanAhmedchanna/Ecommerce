package com.Ecommerce.Ecommerce.in.Repo;


import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Integer, Id> {
}
