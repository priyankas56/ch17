package com.xworkz.standards.service;

import com.xworkz.standards.repository.AddressRepository;

public class AddressServiceImpl implements AddressService{
	private AddressRepository addressRepository;
	
	public AddressServiceImpl(AddressRepository addressRepository)
	{
		this.addressRepository=addressRepository;
	}

	@Override
	public String push() {
		System.out.println("running push in addressserviceimple");
		if(addressRepository!=null)
		{
		boolean saved=addressRepository.save();
		System.out.println("addressrepo push:"+saved);
		if(saved)
		{
			System.out.println("saved in addressrepo");
			return "failure";
		}else {
			System.out.println("not saved in addressrepo");
			return "success";
		}
			
			
		}
		
		return "issue";
	}

	@Override
	public String refresh() {
		System.out.println("running refresh in addressserviceimple");
		if(addressRepository!=null)
		{
		int value=addressRepository.update();
		System.out.println("reository value:"+value);
		if(value<1)
		{
			System.out.println("upadate failure value:"+value);
			return "failure";
		}else {
			System.out.println("upadate success value:"+value);
			return "success";
		}
		}
		return "issue";
	}

	@Override
	public String remove() {
		System.out.println("running remove in addressserviceimple");
		if(addressRepository!=null)
		{
			addressRepository.delete();
		}else {
			System.out.println("addressRepository is null");
		}
		return null;
	}

	@Override
	public String load() {
		System.out.println("running load in addressserviceimple");
		if(addressRepository!=null)
		{
			String same=addressRepository.read();
			System.out.println("repository same:"+same);
			if(same != null)
			{
				System.out.println("repo is readable");
			}else {
				System.out.println("repo is not readable");
			}
		}
		return "issue";
	}

}
