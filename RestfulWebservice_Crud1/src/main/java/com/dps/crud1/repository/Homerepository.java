package com.dps.crud1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dps.crud1.model.Customer;

@Repository
public interface Homerepository extends JpaRepository<Customer, Integer> {

}
