package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Category;
import com.example.product.repository.CategoryRepositoryImpl;
@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepositoryImpl categoryRepo;
	
	public List<Category> findAll() {
		
		return categoryRepo.findAll();
	}
	
}
