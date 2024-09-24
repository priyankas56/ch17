package com.xworkz.standards.runner;

import com.xworkz.standards.repository.Bank;
import com.xworkz.standards.service.HDFCBank;

public class BankRunner {

	public static void main(String[] args) {
	
		
		Bank bank=new HDFCBank();
        bank.name();
	}

}
