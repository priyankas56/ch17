package com.xworkz.standards.repository;

public class Laptop {//encapsulation
	
private String brand="Dell";
private int cost=60000;

public String getBrand()
{
	return this.brand;
}
public int getCost()
{
	return this.cost;
}
public void setBrand(String brand)
{
	this.brand=brand;
}
   void setCost(int cost)
   {
	   this.cost=cost;
   }
}
