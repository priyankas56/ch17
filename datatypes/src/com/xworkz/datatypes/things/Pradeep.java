package com.xworkz.datatypes.things;

public class Pradeep {
	public Camara camara;
	
	public void lens(){
		
		if(camara!=null)
		{
			camara.click();
			System.out.println(camara.color);
			System.out.println(camara.Quality);
			}else {
				System.out.println("camara not null");
		}
	}
	}

