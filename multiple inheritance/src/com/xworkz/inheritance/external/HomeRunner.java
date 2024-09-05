package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Chair;

public class HomeRunner {
	public static void main(String[] args)
	{
		Chair chair=new Chair();
		chair.child();
		chair.clean();
		chair.display();
	}

}
