package com.xworkz.standards.service;

import com.xworkz.standards.repository.Iphone;

public class Staff extends Iphone{

	public Staff(String brand, int cost) {
		super(brand, cost);
		
	}

	@Override
	public void service() {
	System.out.println("running service in staff");		
	}

	@Override
	public void manufacture() {
		System.out.println("running manufacture in staff");
		
	}

}
