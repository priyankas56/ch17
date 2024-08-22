package com.xworkz.sweet.store;

public class SweetStore {
	private String[] sweetStores=new String[7];
	private int position;
	
	public void print(String name)
	{
		System.out.println("print run in sweetstores");
		this.sweetStores[this.position]=name;
		this.position++;
	}	
		public void showNames()
		{
			System.out.println("display run in sweetstores");
			for(String name:this.sweetStores)
				System.out.println("Name:"+name);
				
		}
	}


