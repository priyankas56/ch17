package com.xworkz.internal.things;

public class SatJioAirtelInternetProvider extends JioInternetProvider{

	
	private String launchdate;
	public SatJioAirtelInternetProvider(String name, String ceoname,String launchdate) {
		super(name, ceoname);
		this.launchdate=launchdate;
	
		
	}
	@Override
	public void service() {
		System.out.println("running service in SatJioAirtelInternetProvider");
		System.out.println("launchdate:"+launchdate);
	}

}
