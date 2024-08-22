package com.xworkz.bike;

import com.xworkz.bike.store.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
	       bike.showNames();
	       bike.save("blender");
	       bike.save("ktm");
	       bike.save("royal enfield"); 
	       bike.save("honda");
	       bike.save("tvs");
	       bike.save("pulser");
	       bike.save("yamaha");
	       bike.showNames();
	}

}
