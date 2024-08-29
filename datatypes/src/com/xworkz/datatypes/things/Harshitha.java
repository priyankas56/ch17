package com.xworkz.datatypes.things;

public class Harshitha {
	public void leg(Shoe shoe)
	{
	  if(shoe!=null)
	  {
		shoe.safeGuard();
		System.out.println(shoe.cost);
		System.out.println(shoe.brand);
	  }else {
		  System.out.println("shoe is null");
	  }
	  
	}
	
}
