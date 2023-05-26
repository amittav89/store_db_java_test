package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetails
{

    /* relationships -- many to many*/
    @Id
    @Column(name = "order_no")
    private String order_no;


    /* relationships -- many to many*/
    @Id
    @Column(name = "product_id")
    private String productId;
    
    @Column(name="quantity")
    private int quantity;

}