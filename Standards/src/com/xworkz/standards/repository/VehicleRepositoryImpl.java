package com.xworkz.standards.repository;

public class VehicleRepositoryImpl implements VehicleRepository{

	@Override
	public void save() {
		System.out.println("running save in VehicleRepositoryImple");
		
	}

	@Override
	public void update() {
		System.out.println("running save in VehicleRepositoryImple");
		
	}

	@Override
	public boolean delete() {
		System.out.println("running save in VehicleRepositoryImple");
		return false;
	}

	@Override
	public String read() {
		System.out.println("running save in VehicleRepositoryImple");
		return null;
	}

}
