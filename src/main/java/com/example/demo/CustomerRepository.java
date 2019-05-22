/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    List<Customer> findByFirstName(String lastName);

    List<Customer> findByFirstNameAndLastName(String firstName, String lastName);

    List<Customer> findByFirstNameOrLastName(String firstName, String lastName);

    List<Customer> findByIdLessThan(long id);

    List<Customer> findByIdLessThanEqual(long id);

    List<Customer> findByidGreaterThan(long id);

    List<Customer> findByLastNameStartingWith(String lastName);

    List<Customer> findByLastNameContaining(String lastName);
 List<Customer> findByLastNameContainingIgnoreCase(String lastName);
    
    List<Customer> findByActiveTrue();

    List<Customer> findByActiveFalse();
    
    //List<Customer> findTop3ByFirstNameOrderByIdDesc();
    
    
}
