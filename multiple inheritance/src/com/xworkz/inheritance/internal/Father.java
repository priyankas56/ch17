package com.xworkz.inheritance.internal;

public class Father implements Brother,parent{

	@Override
	public void attack() {
		System.out.println("running attack in father");
		
	}

	@Override
	public void use() {

		System.out.println("running use in father");
	}

}
