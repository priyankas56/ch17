package com.xworkz.interface1.runner;

import com.xworkz.interface1.internal.HospitalRule;

public class HospitalRunner {
	public static void main(String[] args) {
		
		HospitalRule hospitalrule=new HospitalRule();
		hospitalrule.check();
		hospitalrule.records();
		hospitalrule.patientList();
	}

}
