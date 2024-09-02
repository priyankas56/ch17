package com.xworkz.priyanka;

import com.xworkz.priyanka.internal.CentralGovernment;
import com.xworkz.priyanka.internal.StateGovernment;

public class GovernmentRunner {
	public static void main(String[] args)
	{
		StateGovernment stateGovernment=new StateGovernment("karnataka",224,"janatha dal","g parmeswara");
		stateGovernment.print();
		
		CentralGovernment centralGovernment=new CentralGovernment("maharastra",288,"congress","devendra fadnavis");
		centralGovernment.print();
	}

}
