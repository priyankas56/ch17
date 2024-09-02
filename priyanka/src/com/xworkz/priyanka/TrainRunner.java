package com.xworkz.priyanka;

import com.xworkz.priyanka.internal.MetroTrain;
import com.xworkz.priyanka.internal.SubUrbanTrain;

public class TrainRunner {

	public static void main(String[] args) {
	
		MetroTrain metrotrain=new MetroTrain(21,"silk institute","rajajinagara");
		metrotrain.display();
		
		SubUrbanTrain subUrbanTrain=new SubUrbanTrain(22,"vijaynagara","iscon");
		subUrbanTrain.display();

	}

}
