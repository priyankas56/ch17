package com.xworkz.polymorpism;

import com.xworkz.polymorpism.internal.StaticBlock;
import com.xworkz.polymorpism.internal.Suger;
import com.xworkz.polymorpism.internal.SugerCane;

public class StaticBlockRunner {
	
	public static void main(String[] args) {
		
		StaticBlock staticblock=new StaticBlock();
		staticblock.block();
		
		new StaticBlock();
		
		System.out.println("===================");
		
		SugerCane sugercane=new SugerCane();
		sugercane.display();
		sugercane.grind();
		
		Suger suger=new Suger();
		suger.print();

}
}