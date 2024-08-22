package com.xworkz.sandal.data.store;

import com.xworkz.sandal.data.MarketData;

public class MarketStore {
   private MarketData[] datas=new MarketData[5];
   private int index;
   
   public void save(MarketData data)
   {
	   System.out.println("running marketdata");
	   this.datas[this.index]=data;
	   this.index++;
   }
   public void print()
   {
	   System.out.println("print marketdata");
	   for(MarketData data:this.datas)
	   { 
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