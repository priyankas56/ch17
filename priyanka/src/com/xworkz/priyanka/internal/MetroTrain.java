package com.xworkz.priyanka.internal;

public class MetroTrain extends Train{
	
	private String stationName;
	private int platform;
	
	public MetroTrain(int no, String source, String destination)
	{
		super(no,source,destination);
		System.out.println("running no,string in metrotrain");
		
	}

}
