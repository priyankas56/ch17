package com.xworkz.sandal.data.store;

import com.xworkz.sandal.data.SandalData;

public class SandalStore {
	
	private SandalData[] datas=new SandalData[5];
	private int index;
	
	public void save(SandalData data)
	{
		System.out.println("running sandaldatastore");
		this.datas[this.index]=data;
		this.index++;
	}
	public void display()
	{
		System.out.println("dispaly sandaldata");
	
		for(SandalData data:this.datas){
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
		
