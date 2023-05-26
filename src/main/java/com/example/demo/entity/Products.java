package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import static jakarta.persistence.GenerationType.IDENTITY;


@Data
@Entity
public class Products
{
    @Id
    @GeneratedValue(strategy = IDENTITY)
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

    public Products( String productName, double productPrice, int productStock)
    {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public Products() {

    }
}
