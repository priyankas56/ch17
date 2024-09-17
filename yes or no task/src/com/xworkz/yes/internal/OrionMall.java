package com.xworkz.yes.internal;

public class OrionMall extends Mall{
	
    public OrionMall(int noOfShops, String nameOfMall) {
		super(noOfShops, nameOfMall);//chaining
		
	}
	public void shops(int noOfShops)//we can write overloaded const in abstract class
	{
		System.out.println("running shops in mall");
	}
	public void shops(int noOfShops,String nameOfMall)//we can override a constructor
	{
		System.out.println("running shops in mall");
	}

}
