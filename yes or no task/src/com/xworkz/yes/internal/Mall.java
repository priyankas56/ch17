package com.xworkz.yes.internal;

public abstract class Mall {
	private int noOfShops;
	private String nameOfMall;
	public Mall(int noOfShops,String nameOfMall)
	{//we can write const in abstract clas
	this.noOfShops=noOfShops;
	this.nameOfMall=nameOfMall;
	}

	
	public void shops(int noOfShops)//we can write overloaded const in abstract class
	{
		System.out.println("running shops in mall");
	}
	public void shops(int noOfShops,String nameOfMall)
	{
		System.out.println("running shops in mall");
	}
	public void display()
	{
		System.out.println("noOfShops:"+noOfShops);
		System.out.println("nameOfMall:"+nameOfMall);
	}

}
