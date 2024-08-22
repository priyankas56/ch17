package com.xworkz.sweet.item.store;

public class SweetItem {
	private String[] sweetStores=new String[7];
	private int position;
	
	public void print(String name)
	{
		System.out.println("print run in sweetItem");
		this.sweetStores[this.position]=name;
		this.position++;
	}	
		public void showNames()
		{
			System.out.println("showNames run in sweetstores");
			for(String name:this.sweetStores)
				System.out.println("Name:"+name);
				
		}
	}

