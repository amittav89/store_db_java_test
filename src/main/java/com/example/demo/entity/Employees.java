package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Employees
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", nullable = false)
    private Long customer_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "birth_date")
    private Date birth_date;

    @Column(name = "hire_date")
    private Date hire_date;

    @Column(name = "city")
    private String city;

    public Employees(String first_name, String last_name, String phone_number, Date birth_date, Date hire_date, String city)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.birth_date = birth_date;
        this.hire_date=hire_date;
        this.city = city;
    }

    public Employees()
    {

    }
}
