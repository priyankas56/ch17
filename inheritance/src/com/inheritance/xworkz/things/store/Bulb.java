package com.inheritance.xworkz.things.store;

public class Bulb {
	
	public int volts;
	public Bulb()
	{
		System.out.println("created bulb with no arg constuctor");
	}
	public Bulb(int volts)
	{
       this.volts=volts;
	}
	public void glow()
	{
		System.out.println("created glow");
		System.out.println("bulb  volts:"+volts);
	}

}
