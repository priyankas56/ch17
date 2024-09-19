package com.xworkz.interfaceImplimentation.imp;

import com.xworkz.interfaceImplimentation.media.PGrule;

public class Hygiene implements PGrule{

	@Override
	public double costPerMonth() {
	System.out.println("running costpermonth in hygiene");
		return 0;
	}

	@Override
	public boolean wifi() {
	System.out.println("running wifi in hygiene");
		return false;
	}

}
