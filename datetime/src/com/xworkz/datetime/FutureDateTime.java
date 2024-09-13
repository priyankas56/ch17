package com.xworkz.datetime;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class FutureDateTime {
	

	    public static void main(String[] args) {
	        // Current date and time
	        LocalDateTime now = LocalDateTime.now();
	        
	        // Create a future date by adding 10 days, for example
	        LocalDateTime futureDateTime = now.plus(10, ChronoUnit.DAYS);
	        
	        System.out.println("Current DateTime: " + now);
	        System.out.println("Future DateTime (10 days later): " + futureDateTime);
	    }
	}



