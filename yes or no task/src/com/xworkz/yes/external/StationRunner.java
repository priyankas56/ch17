package com.xworkz.yes.external;

import com.xworkz.yes.internal.Electonics;
import com.xworkz.yes.internal.ElectronicItems;
import com.xworkz.yes.internal.Infosys;
import com.xworkz.yes.internal.Mall;
import com.xworkz.yes.internal.Mother;
import com.xworkz.yes.internal.MysoreStation;
import com.xworkz.yes.internal.OrionMall;
import com.xworkz.yes.internal.Product;
import com.xworkz.yes.internal.Station;
import com.xworkz.yes.internal.Store;
import com.xworkz.yes.internal.SwicthBoard;
import com.xworkz.yes.internal.Telivision;
import com.xworkz.yes.internal.Water;
import com.xworkz.yes.internal.WaterBottle;

public class StationRunner {

	public static void main(String[] args) {
		
		Station station=new Station();
		station.run();
	
	    
	    System.out.println("======================================");
	    
	    Store store=new Product();
	    store.use();
	    
	    System.out.println("======================================");
	    
	    Mother mother=new Mother();
	    mother.Learn();
	    mother.Walk();
	    
	    
	    System.out.println("======================================");
	    
	    Telivision telivision=new SwicthBoard();
	    telivision.currentPass();
	    telivision.serial();
	    
	    System.out.println("======================================");
	    
	    Electonics electronics=new ElectronicItems();
	    electronics.run();
	    electronics.store();
	    electronics.StoreA();
	    
	    System.out.println("======================================");
	    
	    WaterBottle waterbottle=new Water();
	     waterbottle.wastage();
	     
	     System.out.println("======================================");
	     
	     Mall mall=new OrionMall(20,"orion");
	     mall.shops(20,"mantrisquare");
	     mall.display();
	     
	     System.out.println("====================================");
	     
	     Infosys infosys=new Infosys();
	     infosys.nansence();
	     
	     
	   
	}
}
