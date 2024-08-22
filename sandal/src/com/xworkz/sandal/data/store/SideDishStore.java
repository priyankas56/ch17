package com.xworkz.sandal.data.store;

import com.xworkz.sandal.data.SideDishData;

public class SideDishStore {
	private SideDishData[] datas=new SideDishData[5];
	private int index;
	
	public void save(SideDishData data)
	{
		System.out.println("running SideDishData");
		this.datas[this.index]=data;
		this.index++;
	}
	public void display()
	{
		System.out.println("dispaly sandaldata");
	
		for(SideDishData data:this.datas){
			  if(data !=null)
				{
					data.show();
				}else
				{
					System.out.println("data is null");
				}
			}
		}
}

