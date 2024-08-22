package com.xworkz.dam;

import com.xworkz.dam.store.Dam;

public class DamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Dam dam=new Dam();
          dam.display();
          dam.save("tungabhadra");
          dam.save("hemavathi");
          dam.save("kabini");
          dam.save("harangi");
          dam.save("krishna raja sagara");
          dam.save("vani vilasa");
          dam.save("nagarjun sagar");
          dam.display();
	}

}
