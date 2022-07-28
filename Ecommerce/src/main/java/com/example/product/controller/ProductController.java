package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/prodList")
	private List<Product> findAll(){
		return prodService.findAll();
	}
	
	@GetMapping("/product/{pId}")
	public Product findById(@PathVariable int pId) {
		
		Product p= prodService.findById(pId);
		return p;
		
	}
	@PostMapping("/product")
	public Product save(@RequestBody Product p) {
		p.setPid(0);
		prodService.save(p);
		
		return p;
		
	}
	@PutMapping("/products")
	public Product update(@RequestBody Product p) {
		prodService.save(p);
		return p;
	}
	
	@DeleteMapping("/products/{id}")
	public String delete(@PathVariable int id) {
		Product p=prodService.findById(id);
		if(p == null)
			throw new RuntimeException("Product id :" + id+" details not found");
		prodService.deleteById(id);
		return "Product id : "+id+" deleted"; 
	}
	
	

}
