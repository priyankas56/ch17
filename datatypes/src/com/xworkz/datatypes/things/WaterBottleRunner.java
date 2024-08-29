package com.xworkz.datatypes.things;

public class WaterBottleRunner {
	
	public static void main(String[] args) {
		
		Gunashree gunashree=new Gunashree();
		gunashree.empty();
		
		Swetha swetha=new Swetha();
		WaterBottle waterbottle=new WaterBottle();
		swetha.crush(waterbottle);
		
		Devu devu=new Devu();
		devu.waterbottle=new WaterBottle();
		devu.geer();
		
	}

}
