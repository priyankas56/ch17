package com.xworkz.interfaceImplimentation.imp;

import com.xworkz.interfaceImplimentation.media.MallRule;

public class OrionMall implements MallRule{

	@Override
	public boolean validId() {
	   System.out.println("running validid in orionmall");
		return false;
	}

}
