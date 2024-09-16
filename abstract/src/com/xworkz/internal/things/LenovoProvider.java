package com.xworkz.internal.things;

public class LenovoProvider extends Provider {
	
		private double profit;
		public LenovoProvider(String name, String ceoname,double profit) {
			super(name,ceoname);
			this.profit=profit;
			
		}
		public void service()
		{
			System.out.println("running service in LenovoProvider");
			System.out.println("profit:"+profit);
		}
}
		

	


