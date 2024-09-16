package com.xworkz.internal.things;

public class BookMyShowMovie extends MovieBookingProvider{

	public BookMyShowMovie(String name, String ceoname) {
		super(name, ceoname);
		
	}
	@Override
	public void service()
	{
		System.out.println("running service in BookMyShowMovie");
	}
	@Override
	public void book() {
		System.out.println("running book in bookmyshow");
	}
	@Override
	public void cancel()
	{
		System.out.println("running cancel in bookmyshow");
	}

}
