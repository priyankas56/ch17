package com.xworkz.interface1.internal;

public class HospitalRule implements Hospital {

	@Override
	public void check() {
		System.out.println("running check in hospitalrule");
	}

	@Override
	public void records() {
		System.out.println("running records in hospitalrule");
	}

	@Override
	public void patientList() {
		System.out.println("running patientList  in hospitalrule");
		
	}

}
