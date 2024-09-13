package com.xworkz.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FutureDate {


    public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
	        // Add 10 days to the current date
	        LocalDate futureDate = today.plusDays(10);
	        System.out.println("Future Date: " + futureDate);

	        // Subtract 2 months from the current date
	        LocalDate pastDate = today.minus(2, ChronoUnit.MONTHS);
	        System.out.println("Past Date: " + pastDate);
	    }
	}


