package com.Ecommerce.Ecommerce.in.Entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String product_name;
    int price;
    double rating;
}
