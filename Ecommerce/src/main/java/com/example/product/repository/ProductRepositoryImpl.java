package com.example.product.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
	
	@Autowired
	EntityManager entityManager;
	
	public List<Product> findAll(){
		
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Product> query= currentSession.createQuery("select p from Product p",Product.class);
		List<Product> prodList=query.getResultList();
		
		return prodList;
	
	}

	
	public Product findById(int id) {
		Session currentSesssion = entityManager.unwrap(Session.class);
		return currentSesssion.get(Product.class, id);
	}


	@Transactional
	public void save(Product p) {
		Session currentSesssion = entityManager.unwrap(Session.class);
		currentSesssion.saveOrUpdate(p);
		
		
	}


	@Transactional
	public void deleteById(int id) {
		Session currentSession=entityManager.unwrap(Session.class);
		Query<Product> query= currentSession.createQuery("delete  from Product where pid= :prodId");
		query.setParameter("prodId", id);
		
		query.executeUpdate();
		
		
	}
	
	
}
