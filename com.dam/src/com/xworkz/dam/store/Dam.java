package com.xworkz.dam.store;

public class Dam {

	private String[] damNames=new String[7];
	private int index;
	
	public void save(String name)
	{
		this.damNames[this.index]=name;
		this.index++;
	}
	public void display()
	{
		for(String name:this.damNames)
			System.out.println("damnames:"+name);
	}
}
