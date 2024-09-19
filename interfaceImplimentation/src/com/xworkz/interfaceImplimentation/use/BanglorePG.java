package com.xworkz.interfaceImplimentation.use;

import com.xworkz.interfaceImplimentation.media.PGrule;

public class BanglorePG {
	
	private PGrule pgRule;
     
	public BanglorePG(PGrule pgRule) 
	{
		this.pgRule=pgRule;
	}
	
public void  safety()
{
	System.out.println("running safety in banglorepg");
	if(pgRule!=null)
	{
		System.out.println("bnglr pg is null");
		double same=pgRule.costPerMonth();
		boolean same1=pgRule.wifi();
		if(same1)
		{
			System.out.println("bnglr pg is safe");
		}else {
			System.out.println("bnglr pg is not safe");
		}
	}else {
		System.out.println("pgrule is not null");
	}
}

}
