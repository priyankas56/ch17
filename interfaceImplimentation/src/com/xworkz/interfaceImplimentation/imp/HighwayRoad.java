package com.xworkz.interfaceImplimentation.imp;

import com.xworkz.interfaceImplimentation.media.TrafficRule;

public class HighwayRoad implements TrafficRule{

	@Override
	public String LincenceNo(String regNo) {
		System.out.println("running licenceno in highwayroad");
		return regNo;
	}

}
