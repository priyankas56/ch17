package com.xworkz.priyanka.internal;

public class Market {
	
	private String name;
	private String location;
	private int shops;
	private String type;
	public Market(String name, String location, int shops, String type) {
		super();
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}
	
	public void display()
	{
		System.out.println("running display in market");
		System.out.println("name:"+name);
		System.out.println("location:"+location);
		System.out.println("shops:"+shops);
		System.out.println("type:"+type);
	}

}
