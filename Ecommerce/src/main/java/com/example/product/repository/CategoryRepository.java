package com.example.product.repository;

import java.util.List;

import com.example.product.entity.Category;

public interface CategoryRepository {
	public List<Category> findAll();

}
