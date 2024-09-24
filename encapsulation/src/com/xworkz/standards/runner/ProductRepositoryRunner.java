package com.xworkz.standards.runner;

import com.xworkz.standards.repository.ProductRepository;
import com.xworkz.standards.repository.ProductRepositoryImpl;
import com.xworkz.standards.service.ProductServiceImpl;

public class ProductRepositoryRunner {

	public static void main(String[] args) {
	   
		
		ProductRepository productRepository=new ProductRepositoryImpl();
		ProductServiceImpl ProductService=new ProductServiceImpl(productRepository);
		ProductService.run();

	}

}
