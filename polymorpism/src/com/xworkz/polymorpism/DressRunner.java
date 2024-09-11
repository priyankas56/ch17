package com.xworkz.polymorpism;

import com.xworkz.polymorpism.internal.Bank;
import com.xworkz.polymorpism.internal.Dress;
import com.xworkz.polymorpism.internal.Electronic;

public class DressRunner {

	public static void main(String[] args) {
		
		Dress dress=new Dress();
		dress.purchase(500);
		dress.purchase(500,"cotton");
		
       System.out.println("===========================");
       
		Bank bank=new Bank();
		bank.credited();
        bank.debited();
        
        System.out.println("===========================");
        
        Electronic electronic=new Electronic();
        electronic.use();

	}

}
