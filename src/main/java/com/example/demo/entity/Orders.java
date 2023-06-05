package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_no", nullable = false)
    private Long order_no;

    /*relationships -- many to one*/

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customers customer;

   /* @Column(name = "customer_id", nullable = false)
    private Long customer_id;*/

    @Column(name = "order_date", nullable = false)
    private Date order_date;

}
