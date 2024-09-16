package com.xworkz.internal.things;

public class InternetProvider extends Provider{

	public InternetProvider(String name, String ceoname) {
		super(name, ceoname);
		
	}

	@Override
	public void service() {
		System.out.println("runninf service in internet provider");
		
	}

}
