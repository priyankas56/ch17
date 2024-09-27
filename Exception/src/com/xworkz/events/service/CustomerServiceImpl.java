package com.xworkz.events.service;

import com.xworkz.events.exception.InvalidAmountException;
import com.xworkz.events.exception.InvalidEmailException;

public class CustomerServiceImpl {
	
	public void save(String Email) throws InvalidEmailException
	{
		System.out.println("running save in CustomerServiceImpl");
		if(Email==null || !Email.contains("@") || !Email.contains(".com"))
		{
			System.out.println("invalid data, will stop the exception");
			throw new InvalidEmailException();
		}
		System.out.println("valid data, will continue the exception");
		System.out.println("email save:"+Email);
	}
	
	public void acceptPrice(int price)
	{
		if(price>0 && price<=100)
		{
			System.out.println("valid price....");
		}
		else
		{
			throw new InvalidAmountException();
		}
	}

}
