package com.xworkz.polymorpism.internal;

public class StaticBlock {//static block-->block is decoreted m associated with the word static
	
	public StaticBlock()
	{
		System.out.println("running staticblock");
	}
	
	public static void block()
	{
		System.out.println("running block in staticblock");
	}
	static
	{
		System.out.println("running static");
	}

}
