package com.xworkz.standards.repository;

public abstract class Iphone {//partial abstraction using abstract class

		private String brand;
		private int cost;
		
		public Iphone(String brand, int cost) {
			super();
			this.brand = brand;
			this.cost = cost;
		}
			public  void service() {
				System.out.println("brand:"+brand);
				System.out.println("cost:"+cost);
			}
			public abstract void manufacture();

}
