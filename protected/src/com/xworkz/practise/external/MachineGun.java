package com.xworkz.practise.external;

import com.xworkz.practise.internal.Weapon;

public class MachineGun extends Weapon{
	
	@Override
	protected void use()
	{
		System.out.println("running use in machinegun");
		super.use();
	}
	@Override
	public void fire()
	{
		System.out.println("running fire in machinegun");
		super.fire();
	}
	

}
