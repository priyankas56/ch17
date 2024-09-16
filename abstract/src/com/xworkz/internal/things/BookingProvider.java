package com.xworkz.internal.things;

public class BookingProvider extends Provider {
		
		public BookingProvider(String name, String ceoname)
		{
			super(name, ceoname);
			System.out.println("const of BookingProvider");
			
		}
		
		public void service()
		{
			System.out.println("running service in BookingProvider");
		}

	}


