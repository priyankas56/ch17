package com.xworkz.polymorpism.internal;

public class Country {
	
	private int state;
	private String name;
	public Country(int state, String name) {
		super();
		this.state = state;
		this.name = name;
	}
	
	public void print()
	{
		System.out.println("running print in country");
	}
	
	public void display()
	{
		System.out.println("state:"+state);
		System.out.println("country name:"+name);
	}

}
