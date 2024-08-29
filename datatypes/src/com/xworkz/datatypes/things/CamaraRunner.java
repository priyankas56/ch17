package com.xworkz.datatypes.things;

public class CamaraRunner {

	public static void main(String[] args) {
                
		Priyanka priyanka=new Priyanka();
		priyanka.picture();
		
		Chinthu chinthu=new Chinthu();
		Camara camara=new Camara();
		chinthu.take(camara);
		
		Pradeep pradeep=new Pradeep();
		pradeep.camara=new Camara();
		pradeep.lens();

	}

}
