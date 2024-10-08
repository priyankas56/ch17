package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class LongNumbers {
	public static void main(String[] args) {
		
		Collection<Long> collection=new ArrayList<Long>();
		collection.add(2345678L);
		collection.add(3345678L);
		collection.add(2376678L);
		collection.add(7945678L);
		collection.add(5545678L);
		collection.add(2645378L);
		collection.add(4345678L);
		collection.add(9945678L);
		collection.add(8345678L);
		collection.add(1245678L);

	
		collection.stream().sorted().collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		System.out.println("running in descending order");
		collection.stream()
		.sorted((ref1,ref2)->{
			if(ref2>ref1) return 1;
			if(ref2<ref1) return -1;
			return 0;
			
		})
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
System.out.println("running in ascending order");
		collection.stream()
		.sorted((ref1,ref2)->{
			if(ref1>ref2) return 1;
			if(ref1<ref2) return -1;
			return 0;
			
		})
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		

	}
	

}
