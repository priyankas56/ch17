package com.xworkz.datetime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PastDate {


	
	    public static void main(String[] args) {
	        // Get the current date
	        LocalDate today = LocalDate.now();
	        
	        // Subtract 10 days from the current date
	        LocalDate pastDate = today.minus(10, ChronoUnit.DAYS);
	        
	        System.out.println("Current Date: " + today);
	        System.out.println("Past Date (10 days ago): " + pastDate);
	    }
	}





