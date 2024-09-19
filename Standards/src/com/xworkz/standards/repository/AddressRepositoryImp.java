package com.xworkz.standards.repository;

public class AddressRepositoryImp implements AddressRepository{

	@Override
	public boolean save() {
	     System.out.println("running save in addressrepositoryimpl");
		return false;
	}

	@Override
	public int update() {
	     System.out.println("running update in addressrepositoryimpl");
		return 2;
	}

	@Override
	public void delete() {
	     System.out.println("running delete in addressrepositoryimpl");
		
	}

	@Override
	public String read() {
	     System.out.println("running read in addressrepositoryimpl");
		return "am read";
	}

}
