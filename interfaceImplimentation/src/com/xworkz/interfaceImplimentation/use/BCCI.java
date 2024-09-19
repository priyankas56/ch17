package com.xworkz.interfaceImplimentation.use;

import com.xworkz.interfaceImplimentation.media.CricketRule;

public class BCCI {
	
	private CricketRule cricketRule;
	
	public void setCricketRule(CricketRule cricketRule)
	{
		this.cricketRule=cricketRule;
	}
	public void check()
	{
		System.out.println("running check in bcci");
		if(cricketRule!=null)
		{
			System.out.println("cricket is not null");
			cricketRule.powerPlay();
		}else {
			System.out.println("cricketrule is null");
		}
	}

}
