package com.xworkz.sandal.data;

public class MarketData {
	String name;
	String location;
	public MarketData(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void show()
	{
		System.out.println("name:"+this.name);
		System.out.println("location:"+this.location);
	}

}
