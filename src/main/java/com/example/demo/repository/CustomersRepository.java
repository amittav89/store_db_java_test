package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long> {
}
