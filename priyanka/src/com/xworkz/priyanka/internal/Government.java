package com.xworkz.priyanka.internal;

public class Government {
	
	private String state;
	private int noOfMalls;
	private String partyHeadName;
	private String homeMinisterName;
	
	
	public Government(String state, int noOfMalls, String partyHeadName, String homeMinisterName) {
		super();
		this.state = state;
		this.noOfMalls = noOfMalls;
		this.partyHeadName = partyHeadName;
		this.homeMinisterName = homeMinisterName;
	}
	
	public void print()
	{
		System.out.println("running print in governament");

		System.out.println("state:"+state);
		System.out.println("noOfMalls:"+noOfMalls);
		System.out.println("partyHeadName:"+partyHeadName);
		System.out.println("homeMinisterName:"+homeMinisterName);
	}
	

}
