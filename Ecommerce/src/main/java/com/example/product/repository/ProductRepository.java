package com.example.product.repository;

import java.util.List;

import com.example.product.entity.Product;

public interface ProductRepository {
	public List<Product> findAll();
	public Product findById(int id);
	public void save(Product p);
	public void deleteById(int id);
}
