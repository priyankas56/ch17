package com.xworkz.practise.internal;

public class Gun extends Weapon{
	
	@Override
	protected void use()
	{
		System.out.println("running use in gun");
	}
	@Override
	public void fire()
	{
		System.out.println("running fire in gun");
	}
	public void show()
	{
        use();
        fire();
	}

}
