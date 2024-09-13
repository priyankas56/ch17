package com.xworkz.array.runner;

import com.xworkz.array.Person;

public class PersonRunner {
	
	public static void main(String[] args) {
		

		  
		        Person[] people = new Person[5];

			    people[0] = new Person("priyanka","priyankagowda773@gmail.com",21,7760750873f);
			    people[1] = new Person("varsha","varshahegde@gmail.com",21,7658999873f);
			    people[2] = new Person("sowmya","sowmyagowda773@gmail.com",21,8790750873f);
			    people[3] = new Person("raksha","rakshagowda773@gmail.com",21,9990750873f);
			    people[4] = new Person("shivu","shivu@gmail.com",22,7890750873f);
		        
		        for (int i = 0; i < people.length; i++) {
		            System.out.println("Person " + (i + 1) + " Details:");
		            people[i].display();
		        }
		    }
		}


