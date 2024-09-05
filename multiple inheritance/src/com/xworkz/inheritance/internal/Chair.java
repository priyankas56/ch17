package com.xworkz.inheritance.internal;

public class Chair extends Home implements Male,Female {
	
	
	public void display()
	{
		System.out.println("running display in chair");
	}
	
	public void child()
	{
		System.out.println("running child in chair");
	}

}
