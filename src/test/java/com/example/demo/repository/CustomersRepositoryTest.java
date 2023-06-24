package com.example.demo.repository;

import com.example.demo.entity.Customers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomersRepositoryTest
{
    @Autowired
        private CustomersRepository customerRepository;

        @Test
        public void  saveCustomer()
        {
            Customers customer = new Customers
                    ("Amit",
                    "Tavashi",
                   "0525858960",
                    "2004-02-06",
                     "Holon");
            customerRepository.save(customer);

        }

        @Test
        public void printAllCustomers()
        {
            List<Customers> customersList = customerRepository.findAll();
            System.out.println("customers list : " + customersList);
        }
}