package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PrimeMinisters {


	public static void main(String[] args) {
	
		
	Collection<String> collection=new ArrayList<String>();
    collection.add("narendra modi");
    collection.add("manmohan singh");
    collection.add("atal bihari vajpayee");
    collection.add("inder kumar gujral");
    collection.add("h.d devegowda");
    collection.add("p.v narasimha rao");
    collection.add("chandra shekhar");
    collection.add("v.p singh");
    collection.add("rajiv gandhi");
    collection.add("indira gandhi");
    collection.add("charan singh");
    collection.add("morarji desai");
    collection.add("gulzarilal nandha");
    collection.add("lal bahadur shastri");
    collection.add("jawaharlal nehru");
    System.out.println("running in ascending order");
    collection.stream().sorted().collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
    System.out.println("running in ascending order");
    collection.stream()
    .sorted((ref1,ref2)->ref1.compareTo(ref2))
    .collect(Collectors.toList())
    .forEach((ref)->System.out.println(ref));
    System.out.println("running in descending  order");

    collection.stream()
    .sorted((ref1,ref2)->ref2.compareTo(ref1))
    .collect(Collectors.toList())
    .forEach((ref)->System.out.println(ref));
	}

}
