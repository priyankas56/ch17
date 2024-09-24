package com.xworkz.standards.repository;

public interface ProductRepository {
	
		void use();
	
  default int sale()
  {
	  return 0;
  }
  default String name()
  {
	  return null;
  }
}
