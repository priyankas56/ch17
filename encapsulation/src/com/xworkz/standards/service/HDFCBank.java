package com.xworkz.standards.service;

import com.xworkz.standards.repository.Bank;

public class HDFCBank implements Bank{

	public String name() {
         System.out.println("running name in hdfcbank");
		return null;
	}

}
