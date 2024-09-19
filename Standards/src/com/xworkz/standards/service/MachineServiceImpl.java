package com.xworkz.standards.service;

import com.xworkz.standards.repository.MachineRepository;

public class MachineServiceImpl implements MachineService{
	
	private MachineRepository machineRepository;
	
	public MachineServiceImpl(MachineRepository machineRepository)
	{
		this.machineRepository=machineRepository;
	}

	@Override
	public String save() {
		System.out.println("running save in MachineServiceImple");
		if(machineRepository!=null)
		{
			System.out.println("machinerepo is not null");
			machineRepository.save();
		}else {
			System.out.println("machinerepo is null");
		}
		
		return null;
	}

	@Override
	public String update() {
		System.out.println("running update in MachineServiceImple");
		if(machineRepository!=null)
		{
	int value=machineRepository.update();
	System.out.println("machinerpo value:"+value);
	if(value<2)
	{
		System.out.println("update failure value:"+value);
		return "failure";
	}else {
		System.out.println("update success value:"+value);
		return "success";
	}
		}
		return "issue";
	}

	@Override
	
	public String delete() {
		System.out.println("running delete in MachineServiceImple");
		if(machineRepository!=null)
		{
	int value1=machineRepository.delete();
	System.out.println("machinerpo value:"+value1);
	if(value1<3)
	{
		System.out.println("delete failure value:"+value1);
		return "failure";
	}else {
		System.out.println("delete success value:"+value1);
		return "success";
	}
		}
		return "issue";
	}

	@Override
	public String read() {
		System.out.println("running read in MachineServiceImple");
		if(machineRepository!=null)
		{
	int value3=machineRepository.update();
	System.out.println("machinerpo value:"+value3);
	if(value3<1)
	{
		System.out.println("read failure value:"+value3);
		return "failure";
	}else {
		System.out.println("read success value:"+value3);
		return "success";
	}
		}
		return "issue";
	}
	
	
	

}
