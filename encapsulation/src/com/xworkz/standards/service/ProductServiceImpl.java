package com.xworkz.standards.service;

import com.xworkz.standards.repository.ProductRepository;

public class ProductServiceImpl {
	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository)
	{
		this.productRepository=productRepository;
	}
	public void run()
	{
		if(productRepository!=null)
		{
			System.out.println("running run in productRepo");
			productRepository.use();
		}else {
			System.out.println("ProductService is null");
		}
	}

}
