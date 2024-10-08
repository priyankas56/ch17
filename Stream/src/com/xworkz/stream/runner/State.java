package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class State {

	public static void main(String[] args) {

		
		Collection<String> collection=new ArrayList<String>();
        collection.add("andra pradesh");
        collection.add("jharkhand");
        collection.add("karnataka");
        collection.add("kerala");
        collection.add("madya pradesh");
        collection.add("maharastra");
        collection.add("manipur");
        collection.add("meghalaya");
        collection.add("mizoram");
        collection.add("nagaland");
        collection.add("odidsha");
        collection.add("punjab");
        collection.add("rajasthan");
        collection.add("sikkim");
        collection.add("tamilnadu");
        collection.add("telangana");
        collection.add("himachachal pradesh");
        collection.add("haryana");
        collection.add("chattishgadh");
        collection.add("bihar");
        collection.add("assam");
        collection.add("arunachal pradesh"); 
        collection.add("tripura");
        collection.add("uttar pradesh");
        collection.add("uttarakhand");
        collection.add("west bengal");
       
        collection.stream().sorted().collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		System.out.println("running in ascending order order");
		collection.stream()
		.sorted((ref1,ref2)-> ref1.compareTo(ref2))
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
		
		collection.stream().sorted().collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		System.out.println("running in descending order");
		collection.stream()
		.sorted((ref1,ref2)->  ref2.compareTo(ref1))
		.collect(Collectors.toList())
		.forEach((ref)->System.out.println(ref));
	}
}
