package br.com.marseller.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marseller.model.Product;
import br.com.marseller.repository.ProductRepository;


@RestController
@RequestMapping("/api/products")
public class ProductController {

	private ProductRepository productRepository;
	
	
	public ProductController(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}


	@GetMapping("/")
	public List<Product> getAll() {
		return productRepository.findAll();
	}
	
}
