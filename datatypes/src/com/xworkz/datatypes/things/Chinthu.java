package com.xworkz.datatypes.things;

public class Chinthu {
	
	public void take(Camara camara)
	{
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
