class SimcardRunner
{
   public static void main(String[] args)
	{
		System.out.println("start main in simcardrunner");
		Simcard simcard=new Simcard("airtel",350);
		System.out.println("simcard name:"+simcard.name);
		System.out.println("simcard price:"+simcard.price);
		
		Simcard simcard1=new Simcard("jio",450);
		System.out.println("simcard name:"+simcard1.name);
		System.out.println("simcard price:"+simcard1.price);
		
		Simcard simcard2=new Simcard("bsnl",360);
		System.out.println("simcard name:"+simcard2.name);
		System.out.println("simcard price:"+simcard2.price);
		
		Simcard simcard3=new Simcard("tata docomo",370);
		System.out.println("simcard name:"+simcard3.name);
		System.out.println("simcard price:"+simcard3.price);
		
		Simcard simcard4=new Simcard("reliance",380);
		System.out.println("simcard name:"+simcard4.name);
		System.out.println("simcard price:"+simcard4.price);
		
		Simcard simcard5=new Simcard("sim",250);
		System.out.println("simcard name:"+simcard5.name);
		System.out.println("simcard price:"+simcard5.price);
		
		Simcard simcard6=new Simcard("vi",260);
		System.out.println("simcard name:"+simcard6.name);
		System.out.println("simcard price:"+simcard6.price);
		
		
		Simcard simcard7=new Simcard("mtnl",270);
		System.out.println("simcard name:"+simcard7.name);
		System.out.println("simcard price:"+simcard7.price);
		
		Simcard simcard8=new Simcard("gsm",290);
		System.out.println("simcard name:"+simcard8.name);
		System.out.println("simcard price:"+simcard8.price);
		
		Simcard simcard9=new Simcard("vodafone",330);
		System.out.println("simcard name:"+simcard9.name);
		System.out.println("simcard price:"+simcard9.price);
		
		Simcard simcard10=new Simcard("idea",340);
		System.out.println("simcard name:"+simcard10.name);
		System.out.println("simcard width:"+simcard10.price);
		System.out.println("end main in simcardrunner");
	}
}