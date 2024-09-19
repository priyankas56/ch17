package com.xworkz.interfaceImplimentation.use;

import com.xworkz.interfaceImplimentation.media.MallRule;

public class MantriSquareMall {
	private MallRule mallRule;
	
	public MantriSquareMall(MallRule mallRule)
	{
		this.mallRule=mallRule;
	}
	public void shops()
	{
		System.out.println("running signals in drivingregulation");
		if(mallRule !=null)
		{
			boolean complete=mallRule.validId();
		
			if(complete) {
				System.out.println("id is vaalid");
			}else {
				System.out.println("id is invalid");
			}
			}else {
				System.out.println("mallRule is null");
		}
	}

}
