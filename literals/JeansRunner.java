class JeansRunner
{
	public static void main(String[]args)
	{
		Jeans jeans=new Jeans();
		jeans.size=32;
		jeans.type="cotton";
		System.out.println("jeans size:"+jeans.size);
		System.out.println("jeans type:"+jeans.type);
		System.out.println("jeans price:"+jeans.price);
		
		Jeans jeans1=new Jeans();
		jeans1.size=30;
		jeans1.type="ton";
		System.out.println(" updated jeans size:"+jeans1.size);
		System.out.println(" updated jeans price:"+jeans1.type);
		
		Charger charger=new Charger();
		charger.type="phone charger";
		charger.price=450;
		System.out.println("charger type:"+charger.type);
		System.out.println("charger price:"+charger.price);
		System.out.println("charger capacity:"+charger.capacity);
		
		Crow crow=new Crow();
		crow.fly=true;
		crow.crowLeg=2;
		System.out.println("crow fly:"+crow.fly);
		System.out.println("crow legs:"+crow.crowLeg);
		System.out.println("crow color:"+crow.color);
		
		Clock clock=new Clock();
		clock.color="blue";
		clock.company="windos";
		System.out.println("clock color:"+clock.color);
		System.out.println("clock company:"+clock.company);
		System.out.println("crow color:"+clock.number);
		
		Lolipop lolipop=new Lolipop();
		lolipop.name="strawbwrry lolipop";
		lolipop.price=40;
		System.out.println("lolipop name:"+lolipop.name);
		System.out.println("lolipop price:"+lolipop.price);
		System.out.println("lolipop quantity:"+lolipop.quantity);
		
		Keyboard keyboard=new Keyboard();
		keyboard.type="laptop";
		keyboard.price=1000;
		System.out.println("keyboard type:"+keyboard.type);
		System.out.println("keyboard price:"+keyboard.price);
		System.out.println("keyboard color:"+keyboard.color);
		
		Mountain mountain=new Mountain();
		mountain.height=99999999;
		mountain.name="mount everest";
		System.out.println("mountain height:"+mountain.height);
		System.out.println("mountain name:"+mountain.name);
		System.out.println("mountain type:"+mountain.type);
		
		Stadium stadium=new Stadium();
		stadium.name="chinnaswamy stadium";
		stadium.length=200;
		System.out.println("stadium name:"+stadium.name);
		System.out.println("stadium length:"+stadium.length);
		System.out.println("stadium shape:"+stadium.shape);
		
		Spray spray=new Spray();
		spray.name="water spray";
		spray.price=100;
		System.out.println("spray name:"+spray.name);
		System.out.println("spray.price:"+spray.price);
		System.out.println("spray quantity:"+spray.quantity);
	
	}
}