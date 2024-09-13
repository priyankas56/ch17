package com.xworkz.datetime;
import java.time.*; 
import java.time.temporal.*; 
public class DateTime {

	  
	    public static void main(String[] args) 
	    { 
	        // Create LocalDate object 
	        // using LocalDate.of() method 
	        LocalDate date = LocalDate.of(2020, 5, 13); 
	  
	        // Create LocalTime object 
	        // using LocalTime.of() method 
	        LocalTime time = LocalTime.of(6, 30); 
	  
	        // Create LocalDateTime object 
	        LocalDateTime localdatetime = LocalDateTime.of(date, time); 
	  
	        // Print full date and time 
	        System.out.println("DateTime:"+localdatetime); 
	    } 
}


