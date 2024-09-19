package com.xworkz.standards.service;

import com.xworkz.standards.repository.Repository;

public class ServiceImple implements Service {
	
	private Repository repository;
	public ServiceImple(Repository repository)
	{
		this.repository=repository;
		System.out.println("repository param const in serviceImple");
	}


	@Override
	public String push() {
		System.out.println("running push in servicImple");
		if(repository!=null)
		{
			boolean saved=repository.save();
			if(saved) {
				System.out.println("saved in repo");
				return "success";
			}else {
				System.out.println("not saved in repo");
				return "failure";
			}
		}
		return "issue";
	}


	@Override
	public String refresh() {
	System.out.println("refresh in serviceimple");
	if(repository!=null)
	{
	int value=repository.update();
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
}