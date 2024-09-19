package com.xworkz.standards.repository;

public class RepositoryImp implements Repository{

	@Override
	public boolean save() {
	System.out.println("running save in repositoryimpl");
		return true;
	}

	public int update() {
		System.out.println("running update in repositoryimpl");
		return 2;
	}

}
