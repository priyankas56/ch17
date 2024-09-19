package com.xworkz.standards.runner;

import com.xworkz.standards.repository.AddressRepository;
import com.xworkz.standards.repository.AddressRepositoryImp;
import com.xworkz.standards.repository.MachineRepository;
import com.xworkz.standards.repository.MachineRepositoryImpl;
import com.xworkz.standards.repository.Repository;
import com.xworkz.standards.repository.RepositoryImp;
import com.xworkz.standards.repository.VehicleRepository;
import com.xworkz.standards.repository.VehicleRepositoryImpl;
import com.xworkz.standards.service.AddressService;
import com.xworkz.standards.service.AddressServiceImpl;
import com.xworkz.standards.service.MachineService;
import com.xworkz.standards.service.MachineServiceImpl;
import com.xworkz.standards.service.Service;
import com.xworkz.standards.service.ServiceImple;
import com.xworkz.standards.service.VehicleService;
import com.xworkz.standards.service.VehicleServiceImpl;

public class ServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repository repository=new RepositoryImp();
		Service service=new ServiceImple(repository);
		String msg=service.push();
		System.out.println("push return:"+msg);
		
		
		
		String refreshMsg=service.refresh();
		System.out.println("push return:"+refreshMsg);
		
		System.out.println("=============================");
		
		AddressRepository addressRepository=new AddressRepositoryImp();
	     AddressService  AddressService=new AddressServiceImpl(addressRepository);
	    String msg1=AddressService.push();
	    System.out.println("push return:"+msg1);
	    
	    String refreshMsg1=AddressService.refresh();
		System.out.println("refresh return:"+refreshMsg1);
		
		String removeMsg=AddressService.remove();
		System.out.println("remove return:"+removeMsg);
			
	    String loadMsg=AddressService.load();
		System.out.println("load return:"+loadMsg);
		
		System.out.println("===================================");
		
		VehicleRepository VehicleRepository=new VehicleRepositoryImpl();
		VehicleService VehicleService=new VehicleServiceImpl(VehicleRepository);
		String persistMsg=VehicleService.persist();
		System.out.println("persist return:"+persistMsg);
		
		String  mergeMsg=VehicleService.merge();
		System.out.println("merge return:"+mergeMsg);
		
		String  clearMsg=VehicleService.clear();
		System.out.println("clear return:"+clearMsg);
		
		String  searchMsg=VehicleService.search();
		System.out.println("search return:"+searchMsg);
		
		System.out.println("========================");
		
		MachineRepository machineRepository=new MachineRepositoryImpl();
		MachineService 	machineService=new MachineServiceImpl( machineRepository);
		String pushMsg1=machineService.save();
		System.out.println("push return:"+pushMsg1);
		
		String updateMsg1=machineService.update();
		System.out.println("update return:"+updateMsg1);
		
		String deleteMsg1=machineService.delete();
		System.out.println("delete return:"+deleteMsg1);
		
		String readMsg1=machineService.read();
		System.out.println("read return:"+readMsg1);

		
		
		
	    
	    
	}

}
 