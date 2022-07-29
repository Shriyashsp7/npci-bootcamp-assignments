package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/prodlist")
	public String findll(Model model){
		List<Product> product=prodService.findAll();
		model.addAttribute("PRODUCT", product);
		return "productUI/products.html";
	}
	@GetMapping("/addProduct")
	public String productForm(Model model) {
		model.addAttribute("PRODUCT",new Product());
		return "productUI/productForm.html";
		
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("prodId") Integer id, Model model) {
		Product product = prodService.findById(id);
		model.addAttribute("PRODUCT",product);
		return "productUI/productForm.html";
	}
	
	@GetMapping("/delete")
	public String deleteById(@RequestParam("prodId") Integer id) {
		prodService.deleteById(id);
		
		return "redirect:/product/prodlist";
	}

	
	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCT") Product product) {
		prodService.save(product);
		
		return "redirect:/product/prodlist";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("productName") String pname,Model model)
	{
		List<Product> products= prodService.searchBy(pname);
		model.addAttribute("PRODUCT", products);
		return "productUI/prodlist";
	}
}
