package com.xworkz.RND.internal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Details {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\dell\\eclipse-workspace\\RND\\src\\com\\xworkz\\RND\\internal\\Priyanka.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line of the file to the console
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}

