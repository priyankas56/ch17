package com.xworkz.datatypes.things;

public class Param {
	public Shoe shoe;//instance variable
	
	public void walk()
	{
		if(shoe!=null)
		{
			shoe.safeGuard();
			System.out.println(shoe.cost);
			System.out.println(shoe.brand);
		}else {
			System.out.println("shoe not null");
			
		}
	}

}
