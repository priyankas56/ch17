package com.xworkz.priyanka;

import com.xworkz.priyanka.internal.OnlineMarket;
import com.xworkz.priyanka.internal.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
		
		
	SuperMarket SuperMarket=new SuperMarket("kr market","kr market",30,"flower market");
		
		SuperMarket.display();
		
		OnlineMarket OnlineMarket=new OnlineMarket("lulu hypermarket","banglore",5,"store");
		OnlineMarket.display();
	}

}
