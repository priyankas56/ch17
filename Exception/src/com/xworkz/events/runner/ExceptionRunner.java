package com.xworkz.events.runner;

import com.xworkz.events.exception.InvalidEmailException;
import com.xworkz.events.service.CustomerServiceImpl;

public class ExceptionRunner {

	public static void main(String[] args) throws InvalidEmailException {
		
		CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
		System.out.println("running before check price");
		customerServiceImpl.acceptPrice(50);
		System.out.println("running after check price");
		
		System.out.println("running before save method");
		customerServiceImpl.save("priyankagowda@gamil.com");
		System.out.println("running after save method");
		

	}

}
