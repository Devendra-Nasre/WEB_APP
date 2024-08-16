package com.dps.crud1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dps.crud1.model.Customer;
import com.dps.crud1.repository.Homerepository;
import com.dps.crud1.service.HomeService;
@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	Homerepository repo;

	@Override
	public void save(Customer c) {
		// TODO Auto-generated method stub
		repo.save(c);
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		List<Customer> list = repo.findAll();
		return list;
	}

	@Override
	public Customer getData(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer singleUpdate(Integer id, Customer c1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Integer id, Customer c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateData(Integer id, Customer c) {
		// TODO Auto-generated method stub
		
	}

}
