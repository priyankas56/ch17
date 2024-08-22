package com.xworkz.river.store;

public class River {
  private String[] riverNames=new String[7];
  private int index;
  
  public void print(String name)
  {
	  this.riverNames[this.index]=name;
	  this.index++;
  }
  public void display()
  {
	  for(String riverNames:this.riverNames)
		  System.out.println("rivernames:"+riverNames);
  }
}
