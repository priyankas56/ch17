package com.xworkz.datatypes.things;

public class Swetha {
	
	public void crush(WaterBottle waterbottle)
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
