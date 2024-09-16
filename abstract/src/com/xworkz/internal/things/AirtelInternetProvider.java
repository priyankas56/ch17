package com.xworkz.internal.things;

public class AirtelInternetProvider extends InternetProvider{

	public AirtelInternetProvider(String name, String ceoname) {
		super(name, ceoname);
		
	}
	@Override
	public void service() {
		System.out.println("running service in AirtelInternetProvider");
		
	}

}
