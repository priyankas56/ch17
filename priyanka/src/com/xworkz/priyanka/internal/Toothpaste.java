package com.xworkz.priyanka.internal;

public class Toothpaste {
	
	private String company;
	private boolean salt;
	
	public Toothpaste(String company)
	{
	this.company = company;
	System.out.println("running string in cons");
	}
	
	public Toothpaste(String company, boolean salt)
	{
	this.company = company;
	this.salt = salt;
	System.out.println("running string,boolean in cons");
	}
	
	public void display()
	{
		System.out.println("display running in toothpaste");	
		System.out.println("company"+company);
	    System.out.println("salt"+company);	
}
}
