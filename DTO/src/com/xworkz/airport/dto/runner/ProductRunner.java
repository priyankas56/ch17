package com.xworkz.airport.dto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.airport.dto.ProductDTO;

public class ProductRunner {

	public static void main(String[] args) {
	
		Collection<ProductDTO> productDTO=new ArrayList<ProductDTO>();
		productDTO.add(new ProductDTO(1,"iphone","apple",80000));
		productDTO.add(new ProductDTO(2,"laptop","dell",60000));
		productDTO.add(new ProductDTO(3,"fan","wipro",2000));
		productDTO.add(new ProductDTO(4,"grinder","pizon",3000));
		productDTO.add(new ProductDTO(5,"lipstick","nyka",500));
		productDTO.add(new ProductDTO(6,"watch","apple",1500));
		productDTO.add(new ProductDTO(7,"frige","ac",500));
		productDTO.add(new ProductDTO(8,"dove","kissan",500));
		productDTO.add(new ProductDTO(9,"realme","android",500));
		productDTO.add(new ProductDTO(10,"kazal","myntra",500));
		
		productDTO.forEach((productDTOs)->System.out.println(productDTOs));

		
		productDTO.stream().sorted().forEach((dto)->System.out.println(dto));
		
    System.out.println("greater than 5000");	
	productDTO.stream()
	.filter((dto)->dto.getCost()>5000)
	.sorted((dto1,dto2)->Double.compare(dto2.getCost(), dto1.getCost()))
	.forEach((dto)->System.out.println(dto));
	System.out.println("===================");
	productDTO.stream()
	.filter((dto)->dto.getCost()>5000 && dto.getCost()<30000)
	.sorted((dto1,dto2)->dto1.getVendor().compareTo(dto2.getVendor()))
	.forEach((dto)->System.out.println(dto));
	System.out.println("==============");
		productDTO.stream()
		.sorted((dto1,dto2)->dto1.getVendor().compareTo(dto2.getVendor()))
		.forEach((dto)->System.out.println(dto));
		
		System.out.println("running in desending order");
		productDTO.stream()
		.sorted((dto1,dto2)->Double.compare(dto2.getCost(), dto1.getCost()))
		.forEach((dto)->System.out.println(dto));
		
		System.out.println("running in ascending order");
		productDTO.stream()
		.sorted((dto1,dto2)->Double.compare(dto1.getCost(), dto2.getCost()))
		.forEach((dto)->System.out.println(dto));
		
		System.out.println("==============");
		productDTO.stream()
		.filter((dto)->dto.getVendor().startsWith("a"))
		.sorted((dto1,dto2)->dto1.getName().compareTo(dto2.getName()))
		.forEach((dto)->System.out.println(dto));
		
		System.out.println("==============");
		productDTO.stream()
		.sorted((dto1,dto2)->dto1.getName().compareTo(dto2.getName()))
		.forEach((dto)->System.out.println(dto));
		
		System.out.println("sort cost");
		
	  productDTO.stream()
	.sorted((dto1,dto2)->Double.compare(dto1.getCost(),dto2.getCost()))
	.forEach((dto)->System.out.println(dto));
	  
	  System.out.println("sort id");
		
	  productDTO.stream()
	.sorted((dto1,dto2)->Integer.compare(dto1.getId(),dto2.getId()))
	.collect(Collectors.toList())
	.forEach((dto)->System.out.println(dto));
	  
	  System.out.println("=================================================");
		//Collect product sort by cost & id

	  productDTO.stream()
      .sorted(Comparator.comparingDouble(ProductDTO::getCost)
              .thenComparingInt(ProductDTO::getId)) 
      .collect(Collectors.toList()).forEach(ref->System.out.println(ref));



		System.out.println("=======================");
		//Collect only names from product

		productDTO.stream().map((ref)->ref.getName())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));


		System.out.println("==========================");
		//Collect only id from product

		productDTO.stream().map((ref)->ref.getId())
		.collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));


		System.out.println("=========================");
		

		productDTO.stream()
		.map((ref)->ref.getName().toUpperCase())
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));

		System.out.println("____________________________");
		productDTO.stream()
		.map((ref)->ref.getVendor().toUpperCase())
		.collect(Collectors.toList()).forEach(ref->System.out.println(ref));

	  
	
	}

}
