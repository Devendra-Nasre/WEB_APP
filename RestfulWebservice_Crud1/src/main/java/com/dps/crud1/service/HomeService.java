package com.dps.crud1.service;

import java.util.List;

import com.dps.crud1.model.Customer;


public interface HomeService {
public void save(Customer c);
public List<Customer> getAll();
public  Customer getData(Integer id);
public Customer singleUpdate(Integer id, Customer c1);
public void update(Integer id, Customer c);
public void updateData(Integer id, Customer c);

 
}
