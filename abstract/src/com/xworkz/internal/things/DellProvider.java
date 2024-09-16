package com.xworkz.internal.things;

public class DellProvider extends Provider{

	public DellProvider(String name, String ceoname) {
		super(name, ceoname);
		System.out.println("const in dellprovider");
	}

	@Override
	public void service() {
		System.out.println("running service in dellprovider");
		
	}
	

}
