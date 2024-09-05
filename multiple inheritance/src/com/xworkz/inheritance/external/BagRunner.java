package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Bag;
import com.xworkz.inheritance.internal.Book;
import com.xworkz.inheritance.internal.Pen;
import com.xworkz.inheritance.internal.Zip;

public class BagRunner {
	
	public static void main(String[] args) {
		
		Bag bag=new Bag();
		Pen pen=new Pen();
		Book book=new Book();
		Zip zip=new Zip();
		
		bag.carry();
		pen.carryA();
		book.carryB();
		zip.carryC();
	}

}
