package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepositoryImpl;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepositoryImpl productrepo;
	
	public List<Product> findAll(){
		return productrepo.findAll();
	}

	
	public Product findById(int id) {
		
		return productrepo.findById(id);
	}


	
	public void save(Product p) {
		productrepo.save(p);
		
	}


	@Override
	public void deleteById(int id) {
		productrepo.deleteById(id);
		
	}
}
