package com.xworkz.priyanka.internal;

public class SubUrbanTrain extends Train {
	private String source;
	private String destination;
	
	
		public SubUrbanTrain(int no, String source, String destination)
		{
			super(no,source,destination);
			System.out.println("running no,string in metrotrain");
	}

}
