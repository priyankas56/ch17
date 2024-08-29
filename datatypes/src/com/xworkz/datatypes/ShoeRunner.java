package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Harshitha;
import com.xworkz.datatypes.things.Omkar;
import com.xworkz.datatypes.things.Param;
import com.xworkz.datatypes.things.Shoe;

public class ShoeRunner {
	
	public static void main(String[] args) {
		
		Omkar omkar=new Omkar();
		omkar.enhanceWalk();
		
		
		Harshitha harshitha=new Harshitha();
		Shoe shoe=new Shoe();
		harshitha.leg(shoe);
		
		Param param=new Param();
		param.shoe=new Shoe();
		param.walk();
	}

}
