package com.xworkz.internal.things;

public class MovieBookingProvider extends BookingProvider {

	public MovieBookingProvider(String name, String ceoname) {
	super(name,ceoname);
	}
	public void service()
	{
		System.out.println("running service in MovieBookingProvider");
	}
	public void book()
	{
		System.out.println("running book in moviebookingprovider");
	}
	public void cancel()
	{
		System.out.println("running cancel in moviebookingprovider");
	}
}
