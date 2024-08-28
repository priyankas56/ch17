package com.inheritance.xworkz.things;

import com.inheritance.xworkz.things.store.Bulb;
import com.inheritance.xworkz.things.store.Bull;
import com.inheritance.xworkz.things.store.Charger;
import com.inheritance.xworkz.things.store.Chicken;
import com.inheritance.xworkz.things.store.Domestic;
import com.inheritance.xworkz.things.store.Halwa;
import com.inheritance.xworkz.things.store.KFC;
import com.inheritance.xworkz.things.store.SmartPhone;
import com.inheritance.xworkz.things.store.Sweet;
import com.inheritance.xworkz.things.store.Tubelight;

public class BulbRunner {

		public static void main(String[] args) {
			
			Bulb bulb1=new Tubelight();
			
			bulb1.volts=60;
			bulb1.glow();
			System.out.println("========================================");
			
			Halwa halwa1=new Sweet();
			halwa1.type="thin";
			halwa1.price=400;
			halwa1.quantity=5;
			halwa1.carrothalwa();
			
			Halwa halwa2=new Sweet();
			halwa2.type="Fluid";
			halwa2.price=400;
			halwa2.quantity=5;
			halwa2.carrothalwa();
			System.out.println("========================================");
			
			SmartPhone smartPhone1=new Charger();
			smartPhone1.versions="real me";
			smartPhone1.price=20000;
			smartPhone1.color="blue";
			smartPhone1.Processor=850;
			smartPhone1.bestsamrtphone();
			System.out.println("========================================");
			
			Bull bull1=new Domestic();
			bull1.type="Black bull";
			bull1.price=50000;
			bull1.gender="Male";
			bull1.noOfBulls=60;
			bull1.use="Racing";
			bull1.fighting();
			System.out.println("========================================");
			
			Chicken chicken1=new KFC();
			chicken1.type="fried chicken";
			chicken1.price=800;
			chicken1.gender="female";
			chicken1.quantity=2;
			chicken1.use="health nutrients";
			chicken1.breed="param";
			chicken1.lifespan=200;
			chicken1.rank="Species";
			chicken1.quality="Superiour";
			chicken1.color="Red";
			chicken1.Nonveg();
			System.out.println("========================================");
			
			

		}

	}

