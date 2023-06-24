package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.Check;
import lombok.Data;

@Data
@Entity
public class Customers
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerID", nullable = false)
    private Long customerID;

    @Column(name = "firstName")
    @Check(constraints = "LENGTH(first_name) >= 5 AND LENGTH(first_name) <= 20")
    private String firstName;

    @Column(name = "lastName")
    @Check(constraints = "LENGTH(last_name) >= 5 AND LENGTH(last_name)<=20")
    private String lastName;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "birthDate")
    private String birthDate;

    @Column(name = "city")
    private String city;

    public Customers(String firstName, String lastName, String phoneNumber, String birthDate, String city)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.city = city;
    }

    public Customers()
    {

    }
}
