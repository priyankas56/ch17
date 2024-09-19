package com.xworkz.standards.repository;

public class MachineRepositoryImpl implements MachineRepository{

	@Override
	public void save() {
	System.out.println("running save in MachineRepositoryimpl");
		
	}

	@Override
	public int update() {
		System.out.println("running update in MachineRepositoryimpl");
		return 4;
	}

	@Override
	public int delete() {
		System.out.println("running delete in MachineRepositoryimpl");
		return 5;
	}

	@Override
	public int read() {
		System.out.println("running read in MachineRepositoryimpl");
		return 9;
	}
	

}
