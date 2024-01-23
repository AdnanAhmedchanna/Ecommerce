package com.Ecommerce.Ecommerce.in.Entitiy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cart")
public class Cart {
    @Id
    private int id;
    private String product_name;
    private String description;
    private double price;
}
