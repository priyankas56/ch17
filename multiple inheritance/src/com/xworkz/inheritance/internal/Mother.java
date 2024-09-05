package com.xworkz.inheritance.internal;

public class Mother implements Brother, parent {

	@Override
	public void use() {
		System.out.println("running use in mother");
		
	}

	@Override
	public void attack() {
		System.out.println("running attack in mother");
		
	}

}
