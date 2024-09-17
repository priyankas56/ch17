package com.xworkz.yes.internal;

public class SwicthBoard implements  Telivision,CableWire{

	@Override
	public void currentPass() {
		System.out.println("running currentPass in Swicthboard");
		
	}

	@Override
	public void serial() {
	
		System.out.println("running serial in Swicthboard");
	}

}
