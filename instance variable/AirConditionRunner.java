class AirConditionRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in rupeerunner");
		
		AirConditoin airConditoin=new AirConditoin();
		String company=airConditoin.company;
		double price=airConditoin.price;
		int quantity =airConditoin.quantity;
		System.out.println("aircondition company name:"+company);
		System.out.println("aircondition price:"+price);
		System.out.println("aircondition quantity:"+quantity);
		
		Autorikshaw autorikshaw=new Autorikshaw();
		String color=autorikshaw.color;
		double price1=autorikshaw.price;
		int quantity2=autorikshaw.quantity;
		System.out.println("autorikshaw color:"+color);
		System.out.println("autorikshaw price:"+price);
		System.out.println("autorikshaw quantity:"+quantity);
		
		AutooDriver autodriver=new AutooDriver();
		String driverName=autodriver.driverName;
		String address=autodriver.address;
		boolean licence=autodriver.licence;
		System.out.println("autodriver name:"+driverName);
		System.out.println("autodriver address:"+address);
		System.out.println("autodriver licence:"+licence);
		
		Rapido rapido=new Rapido();
		String company1=rapido.company;
		String driverName1=rapido.driverName;
		double price2=rapido.price;
		System.out.println("rapido company:"+company1);
		System.out.println("rapido drivername:"+driverName1);
		System.out.println("rapido price:"+price2);
		
		CabDriver cabdriver=new CabDriver();
		String driver1=cabdriver.driver;
		double price3=cabdriver.price;
		boolean licence1=cabdriver.licence;
		System.out.println("cabDriver company:"+driver1);
		System.out.println("cabDriver price:"+price3);
		System.out.println("cabDriver licence:"+licence1);
		
		BMTC bmtc=new BMTC();
		String driverName2=bmtc.driverName;
		int ticketPrice=bmtc.ticketPrice;
		double price4=bmtc.price;
		System.out.println("bmtc driverName:"+driverName);
		System.out.println("bmtc ticketPrice:"+ticketPrice);
		System.out.println("bmtc price:"+price4);
		
		FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
		String company5=foodDeliveryCompany.company;
		double itemPrice=foodDeliveryCompany.itemPrice;
		double workers=foodDeliveryCompany.workers;
		System.out.println("FoodDeliveryCompany name:"+company);
		System.out.println("FoodDeliveryCompany itemPrice:"+itemPrice);
		System.out.println("FoodDeliveryCompany workers:"+workers);
		
		System.out.println("end main in rupeerunner");
	}
}
		
		
			
		
	   