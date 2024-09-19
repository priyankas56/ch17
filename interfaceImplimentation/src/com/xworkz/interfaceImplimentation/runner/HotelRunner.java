package com.xworkz.interfaceImplimentation.runner;

import com.xworkz.interfaceImplimentation.media.HotelRule;
import com.xworkz.interfaceImplimentation.use.CanaraHotelImpl;
import com.xworkz.interfaceImplimentation.use.FoodSafetyDepartment;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelRule hotelRule=new CanaraHotelImpl();
		FoodSafetyDepartment  foodSafetyDepartment=new FoodSafetyDepartment();
		foodSafetyDepartment.setHotelRule(hotelRule);
		foodSafetyDepartment.inspection();
	}

}
