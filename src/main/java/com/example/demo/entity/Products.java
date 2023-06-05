package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import org.hibernate.annotations.Check;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Check(constraints = "product_price>0")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price", nullable = false)
    private double productPrice;

    @Column(name = "product_stock", nullable = false)
    private int productStock;

    /*relationships - many to one*/
    @Column(name = "supplier_id", nullable = false)
    private Long supplierId;

    @ManyToMany(mappedBy = "products")
    private Set<Orders> orders = new HashSet<>();

    public Products(String productName, double productPrice, int productStock) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public Products() {

    }


}