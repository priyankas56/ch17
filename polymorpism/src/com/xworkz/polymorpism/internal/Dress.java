package com.xworkz.polymorpism.internal;

public class Dress {//compile time overloading--->nothing but method overloading
	 private int cost;//same method name but diff parameter
	 private String material;
	 
	public void purchase(int cost)
	{
		System.out.println("running purchase in dress");
	}
	public void purchase(int cost,String material)
	{
		System.out.println("running purchase in dress");
	}
	
	public void display()
	{
		System.out.println("cost:"+cost);
		System.out.println("material:"+material);
	}
	
	

}
