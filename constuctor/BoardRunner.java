class BoardRunner
{
     public static void main(String[] args)
	{
		System.out.println("start main in boardrunner");
		Board board=new Board("black","medium");
		System.out.println("board color:"+board.carat);
		System.out.println("board width:"+board.price);
		
		Board board1=new Board("blue","small");
		System.out.println("board color:"+board1.carat);
		System.out.println("board width:"+board1.price);

		
		Board board2=new Board("white","large");
		System.out.println("board color:"+board2.carat);
		System.out.println("board width:"+board2.price);

		
		Board board3=new Board("black","medium");
		System.out.println("board color:"+board3.carat);
		System.out.println("board width:"+board3.price);

		
		Board board4=new Board("green","small");
		System.out.println("board color:"+board4.carat);
		System.out.println("board width:"+board4.price);

		
		Board board5=new Board("yellow","smalll");
		System.out.println("board color:"+board5.carat);
		System.out.println("board width:"+board5.price);

		
		Board board6=new Board("brown","large");
		System.out.println("board color:"+board6.carat);
		System.out.println("board width:"+board6.price);

		
		Board board7=new Board("orange","medium");
		System.out.println("board color:"+board7.carat);
		System.out.println("board width:"+board7.price);

		
		Board board8=new Board("red","large");
		System.out.println("board color:"+board8.carat);
		System.out.println("board width:"+board8.price);

		
		Board board9=new Board("pink","small");
		System.out.println("board color:"+board9.carat);
		System.out.println("board width:"+board9.price);

		
		Board board10=new Board("sky blue","medium");
		System.out.println("board color:"+board10.carat);
		System.out.println("board width:"+board10.price);
        System.out.println("end main in boardrunner");
	}
}