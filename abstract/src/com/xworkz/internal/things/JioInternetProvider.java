package com.xworkz.internal.things;

public class JioInternetProvider extends InternetProvider {
	public JioInternetProvider(String name, String ceoname) {
		super(name, ceoname);
	
	}
	@Override
	public void service() {
		System.out.println("running service in JioInternetProvider");
	}
}
