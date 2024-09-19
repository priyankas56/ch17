package com.xworkz.interfaceImplimentation.use;

import com.xworkz.interfaceImplimentation.media.HotelRule;

public class CanaraHotelImpl implements HotelRule{

	@Override
	public boolean cleanPremises() {
	         System.out.println("running cleanpremises in canarahotelimple");
		return false;
	}

}
