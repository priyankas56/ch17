package com.xworkz.interfaceImplimentation.use;

import com.xworkz.interfaceImplimentation.media.HotelRule;

public class FoodSafetyDepartment {
	
	private HotelRule hotelRule;
	
	public void setHotelRule(HotelRule hotelRule)
	{
		this.hotelRule=hotelRule;
	}
	public void inspection()
	{
		System.out.println("running inspection in foodsafetydepartment");
		if(hotelRule!=null)
		{
			System.out.println("hotel is not null");
			hotelRule.cleanPremises();
			
		}else {
			System.out.println("hotelrule is null");
		}
	}

}
