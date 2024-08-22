package com.xworkz.sandal.data;

public class SandalData {
	       private String brand;
	       private char size;
	       private double cost;
	       private String color;
		public SandalData(String brand, char size, double cost, String color) {
			super();
			this.brand = brand;
			this.size = size;
			this.cost = cost;
			this.color = color;
		}
	       public void show()
	       {
	    	   System.out.println("brand:"+this.brand);
	    	   System.out.println("size:"+this.size);
	    	   System.out.println("cost:"+this.cost);
	    	   System.out.println("color:"+this.color);
	       }
	      

}
