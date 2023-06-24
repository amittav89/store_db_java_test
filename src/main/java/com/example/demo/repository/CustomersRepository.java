package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Customers;

import java.util.List;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long>
{
    List<Customers> findByFirstName(String firstName);
}
