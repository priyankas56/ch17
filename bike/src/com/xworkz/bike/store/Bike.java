package com.xworkz.bike.store;

public class Bike{ 
	private String[] bikeNames=new String[7];
	  private int index=0;
	
	public void save(String name)
	{
		this.bikeNames[this.index]=name;
		this.index++;
	}
	public void showNames()
	{
		System.out.println("shownames run in bike");
		for(String name:this.bikeNames)
			System.out.println("Name:"+name);
	}

}
