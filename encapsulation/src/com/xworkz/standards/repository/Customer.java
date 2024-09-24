package com.xworkz.standards.repository;

public class Customer {
	public static void main(String[] args) {
	
	Laptop laptop=new Laptop();
		laptop.setCost(500);
		laptop.setBrand("Hp");
	
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getCost());
	}

}
