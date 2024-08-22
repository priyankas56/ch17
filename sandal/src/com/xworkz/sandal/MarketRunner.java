package com.xworkz.sandal;

import com.xworkz.sandal.data.MarketData;
import com.xworkz.sandal.data.store.MarketStore;

public class MarketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MarketStore store=new MarketStore();
          store.print();
          
          MarketData data1=new MarketData("krmarket","krishnarajendra nagar");
          store.save(data1);
          store.print();
          
          MarketData data2=new MarketData("city market","banglore");
          store.save(data2);
          store.print();
          
          MarketData data3=new MarketData("as mrket","banglore");
          store.save(data3);
          store.print();
          
          MarketData data4=new MarketData("nagavarpalya market","banglore");
          store.save(data4);
          store.print();
          
          MarketData data5=new MarketData("jayanagar market","jaynagar");
          store.save(data5);
          store.print();
          
	}

}
