package com.inheritance.xworkz.things.store;

public class Halwa {
	public String type;
	public double price;
	public int quantity;
	
	public Halwa()
	{
		System.out.println("Created a Halwa with no args cons.....");
	}
	public Halwa(String typeOfDense, double price, int quantity)
	{
		this.type=typeOfDense;
		this.price=price;
		this.quantity=quantity;
	}
	public void carrothalwa()
	{
		System.out.println("Running a Halwa");
		System.out.println(" Halwa typeOfDense: "+type);
		System.out.println(" Halwa price: "+price);
		System.out.println(" Halwa quantity: "+quantity);
		
	}
	

}

