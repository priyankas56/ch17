package com.xworkz.priyanka.internal;

public class Train {
	
	private int no;
	private String source;
	private String destination;
	
	public Train(int no, String source, String destination) {
		super();
		this.no = no;
		this.source = source;
		this.destination = destination;
		System.out.println("created no,string no arg constuctor in train");
	}
	public void display()
	{
		System.out.println("runnin display in train");
		System.out.println("no:"+no);
		System.out.println("source:"+source);
		System.out.println("destination:"+destination);
	}
	
}