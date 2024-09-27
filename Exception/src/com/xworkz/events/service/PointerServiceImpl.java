package com.xworkz.events.service;

import com.xworkz.events.exception.PointerException;
import com.xworkz.events.exception.PointerNullException;

public class PointerServiceImpl {
	
	public void use(String name) throws PointerException
	{
		System.out.println("running use in PointerServiceImpl ");
	
	if(name==null || name.equals(""))
	{
		//stop the execution
		System.out.println("invalid data, will stop the execution");
		throw new PointerException();//throw is an create un-expected events or
		//stop the execution of the program this is explicit exception
	}
	//continue the exception
	System.out.println("valid data, will stop the execution");

}
}

