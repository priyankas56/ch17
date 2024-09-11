package com.xworkz.polymorpism.internal;

public class Suger extends SugerCane{

	@Override
	public void grind()
	{
		System.out.println("running suger in sugercane");
		super.grind();
		this.grind();
	}
	@Override
	public void display()
	{
		System.out.println("running display in sugercane");	
	}
	public void print()
	{
		System.out.println("running print in suger");
		super.display();
		this.display();
	}
}