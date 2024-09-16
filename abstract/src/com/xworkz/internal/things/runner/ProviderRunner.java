package com.xworkz.internal.things.runner;

import com.xworkz.internal.things.AirtelInternetProvider;
import com.xworkz.internal.things.BookMyShowMovie;
import com.xworkz.internal.things.BookingProvider;
import com.xworkz.internal.things.DellProvider;
import com.xworkz.internal.things.ExtremeAirtelInternetNetProvider;
import com.xworkz.internal.things.Fast5gExtreme;
import com.xworkz.internal.things.InternetProvider;
import com.xworkz.internal.things.JioInternetProvider;
import com.xworkz.internal.things.LenovoProvider;
import com.xworkz.internal.things.MovieBookingProvider;
import com.xworkz.internal.things.Provider;
import com.xworkz.internal.things.SatJioAirtelInternetProvider;

public class ProviderRunner {
public static void main(String[] args) {

		
		Provider provider=new BookingProvider("infosys","salil paresh");
		provider.service();
		provider.display();
		provider.equals(provider);
		provider.toString();
		System.out.println(provider.toString());
		
		System.out.println("====================");
		
		Provider provider1=new DellProvider("microsoft","satya nadella");
		provider1.service();
		provider.display();
		provider1.equals(provider1);
		provider1.toString();
		System.out.println(provider1.toString());
		
		System.out.println("...............................");
		
		Provider provider2=new LenovoProvider("IBM","arvind krishna",2508880);
		provider2.service();
		provider.display();
		provider2.equals(provider2);
		provider2.toString();
		System.out.println(provider2.toString());
	
		
		System.out.println("...............................");
		
		Provider provider3=new InternetProvider("adobe","shanthanu narayan");
		provider3.service();
		provider.display();
		provider3.equals(provider3);
		provider3.toString();
		System.out.println(provider3.toString());
		
		System.out.println("...............................");
		
		BookingProvider bookingProvider=new MovieBookingProvider("airtel","gopal vittal");
		bookingProvider.service();
		provider.display();
		bookingProvider.equals(bookingProvider);
		bookingProvider.toString();
		System.out.println(bookingProvider.toString());
		
		System.out.println("...............................");
		
		MovieBookingProvider movieBookingProvider=new BookMyShowMovie("amazon","jeff bezos");
		MovieBookingProvider movieBookingProvider1=new BookMyShowMovie("palo alto networks","nikesh arora");
		movieBookingProvider.service();
		provider.display();
		movieBookingProvider.equals(movieBookingProvider1);
		movieBookingProvider.toString();
		movieBookingProvider.book();
		movieBookingProvider.cancel();
		System.out.println(movieBookingProvider.toString());
		
			
		System.out.println("...............................");
		
		
		InternetProvider internetProvider=new AirtelInternetProvider("apple","tim cook");
		InternetProvider internetProvider1=new AirtelInternetProvider("amazon jeff","danial zhang");
		internetProvider.service();
		provider.display();
		internetProvider.equals(internetProvider1);
		internetProvider.toString();
		System.out.println(internetProvider.toString());
		
		System.out.println("...............................");
		
		InternetProvider internetProvider2=new JioInternetProvider("arista network","jayashree ullal");
		internetProvider2.service();
		provider.display();
		internetProvider2.equals(internetProvider2);
		internetProvider2.toString();
		System.out.println(internetProvider2.toString());
		
		System.out.println("...............................");
		
		AirtelInternetProvider airtelInternetProvider=new ExtremeAirtelInternetNetProvider("chanel","leena nair");
		airtelInternetProvider.service();
		provider.display();
		airtelInternetProvider.equals(airtelInternetProvider);
		airtelInternetProvider.toString();
		System.out.println(airtelInternetProvider.toString());
		
		System.out.println("...............................");
		
		JioInternetProvider jioInternetProvider=new SatJioAirtelInternetProvider("sandisk","sanjay mehorota","12-4-2011");
		jioInternetProvider.service();
		provider.display();
		jioInternetProvider.equals(jioInternetProvider);
		jioInternetProvider.toString();
		System.out.println(jioInternetProvider.toString());
		
		System.out.println("...............................");
		
		ExtremeAirtelInternetNetProvider  ExtremeAirtelInternetNetProvider =new Fast5gExtreme("wipro","srini pallia");
		ExtremeAirtelInternetNetProvider.service();
		provider.display();
		ExtremeAirtelInternetNetProvider.equals(ExtremeAirtelInternetNetProvider);
		ExtremeAirtelInternetNetProvider.toString();
		System.out.println(ExtremeAirtelInternetNetProvider.toString());
		
	}

}


