package com.xworkz.datatypes.things;

public class Devu {
	public WaterBottle waterbottle;
	public void geer()
	{
		if(waterbottle!=null)
		{
			waterbottle.fill();
			System.out.println(waterbottle.quantity);
			System.out.println(waterbottle.color);
		}else {
			
		}	System.out.println("waterbottle not null");
	}
}

