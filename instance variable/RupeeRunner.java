class RupeeRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in rupeerunner");
		Rupee rupee=new Rupee();
		
		String shape=rupee.shape;
		double price=rupee.price;
		String INR=rupee.INR;
		System.out.println("rupee shape:"+shape);
		System.out.println("rupee price:"+price);
		System.out.println("rupee INR:"+INR);
		
		
		
		System.out.println("end main in rupeerunner");
	}
}