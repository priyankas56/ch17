package com.xworkz.datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PastDateTime {

	    public static void main(String[] args) {
	        // Current date and time
	        LocalDateTime now = LocalDateTime.now();
	        
	        // Create a past date by subtracting 10 days, for example
	        LocalDateTime pastDateTime = now.minus(10, ChronoUnit.DAYS);
	        
	        System.out.println("Current DateTime: " + now);
	        System.out.println("Past DateTime (10 days ago): " + pastDateTime);
	    }
	}



