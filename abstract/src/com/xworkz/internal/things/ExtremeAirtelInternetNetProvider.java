package com.xworkz.internal.things;

public class ExtremeAirtelInternetNetProvider extends AirtelInternetProvider{

	public ExtremeAirtelInternetNetProvider(String name, String ceoname) {
		super(name, ceoname);
		
	}
	@Override
	public void service() {
		System.out.println("running service in ExtremeAirtelInternetNetProvider");
		
	}

}
