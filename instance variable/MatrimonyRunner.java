class MatrimonyRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in matrimonyrunner");
		Matrimony matrimony=new Matrimony();
		String profile=matrimony.profile;
		double members=matrimony.members;
		String type=matrimony.type;
		System.out.println("matrimony profile name:"+profile);
		System.out.println("matrimony members:"+members);
		System.out.println("matrimony type:"+type);
		matrimony.profile="bharath";
		matrimony.members=1000000;
		matrimony.type="marrige";
	    System.out.println("updated matrimony profile name:"+matrimony.profile);
		System.out.println("updated matrimony members:"+matrimony.members);
		System.out.println("updated matrimony type:"+matrimony.type);
		
		Application application=new Application();
		String name1=application.name;
		int no=application.no;
		String type1=application.type;
		System.out.println("application name:"+name1);
		System.out.println("application no:"+no);
		System.out.println("application type:"+type1);
		application.name="instagram";
		application.no=100;
		application.type="social media";
	    System.out.println("updated application name:"+application.name);
		System.out.println("updated application NO:"+application.no);
		System.out.println("updated application type:"+application.type);
		
		Candy candy=new Candy();
		String name5=candy.name;
		double price5=candy.price;
		int quantity5=candy.quantity;
		System.out.println("candy name:"+name5);
		System.out.println("candy price:"+price5);
		System.out.println("candy quntity:"+quantity5);
		candy.name="whirly pop";
		candy.price=70;
		candy.quantity=2;
	    System.out.println("updated candy name:"+candy.name);
		System.out.println("updated candy price:"+candy.price);
		System.out.println("updated application type:"+candy.quantity);
		
		Place place=new Place();
		String name2=place.name;
		String country=place.country;
		int pincode=place.pincode;
		System.out.println("the place name:"+name2);
		System.out.println("place country:"+country);
		System.out.println("place pincode:"+pincode);
		place.name="goa";
		place.country="india";
		place.pincode=675432;
	    System.out.println("updated place name:"+place.name);
		System.out.println("updated place country:"+place.country);
		System.out.println("updated pincode:"+place.pincode);
		
	
	    Juice juice=new Juice();
		String name3=juice.name;
        double price3=juice.price;
        int quantity=juice.quantity;
		System.out.println("the juice name:"+name3);
		System.out.println("juice price:"+price3);
		System.out.println("juice quantity:"+quantity);
		juice.name="fanta";
		juice.price=45;
		juice.quantity=2;
	    System.out.println("updated place name:"+juice.name);
		System.out.println("updated place country:"+juice.price);
		System.out.println("updated pincode:"+juice.quantity);
		
		Fruit fruit=new Fruit();
		String name4=fruit.name;
        double price4=fruit.price;
        int quantity4=fruit.quantity;
		System.out.println("the fruit name:"+name4);
		System.out.println("fruit price:"+price4);
		System.out.println("fruit quantity:"+quantity4);
		fruit.name="grapes";
		fruit.price=75;
		fruit.quantity=2;
	    System.out.println("updated fruit name:"+fruit.name);
		System.out.println("updated fruit price:"+fruit.price);
		System.out.println("updated quantity:"+fruit.quantity);
		
		Food food=new Food();
		String name8=food.name;
        double price8=food.price;
        int quantity8=food.quantity;
		System.out.println("the juice name:"+name5);
		System.out.println("juice price:"+price5);
		System.out.println("juice quantity:"+quantity5);
		food.name="parota";
		food.price=250;
		food.quantity=2;
	    System.out.println("updated food name:"+food.name);
		System.out.println("updated food price:"+food.price);
		System.out.println("updated food quantity:"+food.quantity);
		
		Medicine medicine=new Medicine();
		String name6=medicine.name;
        double price6=medicine.price;
        int quantity6=medicine.quantity;
		System.out.println("the medicine name:"+name6);
		System.out.println("medicine price:"+price6);
		System.out.println("medicine quantity:"+quantity6);
		medicine.name="medicoff";
		medicine.price=350;
		medicine.quantity=3;
	    System.out.println("updated medicine name:"+medicine.name);
		System.out.println("updated medicine price :"+medicine.price);
		System.out.println("updated medicine quantity:"+medicine.quantity);
		
		AlcoholBrand alcoholBrand=new AlcoholBrand();
		String name7=alcoholBrand.name;
        double price7=alcoholBrand.price;
        int quantity7=alcoholBrand.quantity;
		System.out.println("the AlcoholBrand name:"+name7);
		System.out.println("AlcoholBrand price:"+price7);
		System.out.println("AlcoholBrand quantity:"+quantity7);
		alcoholBrand.name="old monk";
	    alcoholBrand.price=750;
		alcoholBrand.quantity=1;
	    System.out.println("updated alcoholBrand name:"+alcoholBrand.name);
		System.out.println("updated alcoholBrand price:"+alcoholBrand.price);
		System.out.println("updated alcoholBrand quantity:"+alcoholBrand.quantity);
		
		
		System.out.println("end main in rupeerunner");
	}
}
