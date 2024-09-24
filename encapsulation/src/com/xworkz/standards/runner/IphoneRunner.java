package com.xworkz.standards.runner;

import com.xworkz.standards.repository.Iphone;
import com.xworkz.standards.service.Staff;

public class IphoneRunner {

	public static void main(String[] args) {
		
		Iphone iphone=new Staff("iphone16", 140000);
		iphone.service();
		iphone.manufacture();
	
		

	}	

}
