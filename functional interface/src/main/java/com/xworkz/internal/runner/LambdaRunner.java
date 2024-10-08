package com.xworkz.internal.runner;

import com.xworkz.functional.FoodApp;
import com.xworkz.functional.Start;
import com.xworkz.internal.functional.Labour;

public class LambdaRunner {
        
	public static void main(String[] args) {
		Start start=()->{
			System.out.println("running lambda expresstion");
	};
	Labour labour=new Labour();
	labour.startMotor(start);
	
	FoodApp foodapp=(String item)->{
		System.out.println("food from usage class:"+item);
	};
                                                                                     
		labour.orderFood(foodapp);
	}
}
	

