package com.xworkz.interfaceImplimentation.use;

import com.xworkz.interfaceImplimentation.media.TrafficRule;

public class DrivingRegulation {
	
	private TrafficRule trafficRule;
	
	public DrivingRegulation(TrafficRule trafficRule)
	{
		this.trafficRule=trafficRule;
	}

	public void signals(String regNo)
	{
		System.out.println("running signals in drivingregulation");
		if(trafficRule !=null)
		{
			String complete=trafficRule.LincenceNo(regNo);
			System.out.println("registartion no:"+complete);
			if(complete!=null) {
				System.out.println("signals are on");
			}else {
				System.out.println("signlas are off");
			}
			}else {
				System.out.println("trafficRule is null");
		}
	}
	

}
