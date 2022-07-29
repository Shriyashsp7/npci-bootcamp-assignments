package com.example.product.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepo;

	public List<Product> findAll() {

		return productRepo.findAll();
	}

	@Transactional
	public void save(Product p) {

		productRepo.save(p);
	}

	public Product findById(Integer id) {

		Optional<Product> p = productRepo.findById(id);
		Product emp = null;

		if (p.isPresent())
			emp = p.get();

		return emp;
	}

	public void deleteById(Integer id) {
		productRepo.deleteById(id);

	}

	
	public List<Product> searchBy(String pname) {
		List<Product> results=null;
		if(pname !=null && (pname.trim().length() > 0)) {
			results=productRepo.findBypname(pname);
		}
		else {
			results=findAll();
		}
		return results;
	}

}
