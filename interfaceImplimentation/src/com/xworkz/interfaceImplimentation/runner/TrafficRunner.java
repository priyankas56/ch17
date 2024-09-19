package com.xworkz.interfaceImplimentation.runner;

import com.xworkz.interfaceImplimentation.imp.HighwayRoad;
import com.xworkz.interfaceImplimentation.imp.Hygiene;
import com.xworkz.interfaceImplimentation.imp.OrionMall;
import com.xworkz.interfaceImplimentation.media.MallRule;
import com.xworkz.interfaceImplimentation.media.PGrule;
import com.xworkz.interfaceImplimentation.media.TrafficRule;
import com.xworkz.interfaceImplimentation.use.BanglorePG;
import com.xworkz.interfaceImplimentation.use.DrivingRegulation;
import com.xworkz.interfaceImplimentation.use.MantriSquareMall;

public class TrafficRunner {
	
	public static void main(String[] args) {
		
		TrafficRule trafficaRule=new HighwayRoad();
		DrivingRegulation DrivingRegulation=new DrivingRegulation(trafficaRule);
		DrivingRegulation.signals("KA26TA0654");
		
		System.out.println("===================================================");
		
		MallRule mallRule=new OrionMall();
		MantriSquareMall mantriSquareMall=new MantriSquareMall(mallRule);
		mantriSquareMall.shops();
		
		System.out.println("===================================================");
		
		PGrule pgRule=new Hygiene();
		BanglorePG banglorepg=new BanglorePG(pgRule);
		banglorepg.safety();
	}

}
