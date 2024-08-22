package com.xworkz.city.store;

public class CityNames {
	private String[] cityNames=new String[7];
	private int index;
	
	
	public void print(String name)
	{
		this.cityNames[this.index]=name;
		this.index++;
	}
	public void display()
	{
		for(String name:this.cityNames)
			System.out.println("Name:"+name);
	}

}
