package com.xworkz.practise.internal;

public class Board {
	
	private int size;
	private String color;
	
	protected Board()
	{
		System.out.println("running board size n color in baord");
	}
	
	public Board(int size,String color)
	{
		this.size=size;
		this.color=color;
	}
	public void display()
	{
		System.out.println("size:"+size);
		System.out.println("color:"+color);
	}
}
