package com.xworkz.interfaceImplimentation.runner;

import com.xworkz.interfaceImplimentation.media.CricketRule;
import com.xworkz.interfaceImplimentation.use.BCCI;
import com.xworkz.interfaceImplimentation.use.KaCricketRule;

public class CricketRunner {

	public static void main(String[] args) {
	
		
		CricketRule cricketRule=new KaCricketRule();
         BCCI bcci=new BCCI();
         bcci.setCricketRule(cricketRule);
         bcci.check();
	}

}
