package com.xworkz.array;

public class Person {
	
	String name;
	String email;
	int age;
	float mobileNo;
	public Person(String name, String email, int age, float f) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = f;
	}
   public void display()
   {
	  System.out.println("name:"+name);
	  System.out.println("email:"+email);
	  System.out.println("age:"+age);
	  System.out.println("mobileNo"+mobileNo);
   }

}
