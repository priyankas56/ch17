package com.xworkz.internal.functional;

import com.xworkz.functional.FoodApp;
import com.xworkz.functional.Start;

public class Labour {
	
	public void startMotor(Start start) {
		System.out.println("running startmotor in labour");
		if(start!=null)
		{
			start.on();//abstraction
		}
		else {
			System.out.println("start is not null");
		}
	}{
		System.out.println(" exit start startmotor");
	}
 public void orderFood(FoodApp foodapp)
 {
	 if(foodapp!=null)
	 {
		 foodapp.order("idli");
	 }
 }
}

