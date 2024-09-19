package com.xworkz.standards.service;

import com.xworkz.standards.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService{
	
	private VehicleRepository vehicleRepository; 
	
	public VehicleServiceImpl(VehicleRepository vehicleRepository)
	{
		this.vehicleRepository=vehicleRepository;
	}

	@Override
	public String persist() {
		System.out.println("running persist inVehicleServiceimpl");
		if(vehicleRepository!=null)
		{
			vehicleRepository.save();
		}else {
			System.out.println("VehicleRepository is null");
		}
		return "return successfully";
	}

	@Override
	public String merge() {
		System.out.println("running merge inVehicleServiceimpl");
		if(vehicleRepository!=null)
		{
			System.out.println("vehicleRepository is not null");
			vehicleRepository.update();
		}else {
			System.out.println("vehicleRepository is null");
		}
		return "return seccessfully";
	}

	@Override
	public String clear() {
		System.out.println("running clear inVehicleServiceimpl");
		if(vehicleRepository!=null)
		{
			System.out.println("vehicleRepository is not null");
			boolean value=vehicleRepository.delete();
			System.out.println("vehiclerepo value:"+value);
			if(value)
			{
				System.out.println("clear failuer value:"+value);
				return "failure";
			}else {
				System.out.println("clear success value:"+value);
				return "success";
			}
		}else {
			System.out.println("vehicleRepository is null");
		}
		return "issue";
	}

	@Override
	public String search() {
		System.out.println("running search inVehicleServiceimpl");
		if(vehicleRepository!=null)
		{
			String same=vehicleRepository.read();
			System.out.println("vehiclerepo value:"+same);
			if(same!=null)
			{
				System.out.println("search failure value:"+same);
				return "failure";
			}else {
				System.out.println("search success value:"+same);
				return "Success";
			}
		}
		return "issue";
	}

}
