package com.xworkz.inheritance.internal;

public class Laptop {
	private String model;
	private double cost;
	
	public Laptop(String model,double cost)
	{
		System.out.println("running string cost in laptop");
		this.model=model;
		this.cost=cost;
	}
	public void operate()
	{
		System.out.println("running operate in laptop");
		System.out.println("model:"+model);
		System.out.println("cost:"+cost);
	}

}
