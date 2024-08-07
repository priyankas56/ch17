class SpeakerRunner
{
	public static void main(String[] args)
	{
		System.out.println("Starting main in speakerrunner");
		Speaker speaker=new Speaker(10,1000);
		System.out.println("speaker brand:"+speaker.brand);//literal
		System.out.println("speaker size:"+speaker.size);//ref
		System.out.println("speaker cost:"+speaker.cost);//
		speaker.setOutput("monitor");
		speaker.display();
		
		Speaker speaker1=new Speaker(20,2000);
		System.out.println("speaker brand1:"+speaker1.brand);//literal
		System.out.println("speaker size1:"+speaker1.size);//ref
		System.out.println("speaker cost1:"+speaker1.cost);//
		speaker.setOutput("display");
		speaker.display();
		
		Speaker speaker2=new Speaker(30,3000);
		System.out.println("speaker brand2:"+speaker2.brand);//literal
		System.out.println("speaker size2:"+speaker2.size);//ref
		System.out.println("speaker cost2:"+speaker2.cost);//
		speaker.setOutput("keyboard");
		speaker.display();
		
		
		System.out.println("=====================================================================");
		System.out.println("Starting main in rocketrunner");
		Rocket rocket=new Rocket(28000,500);
		System.out.println("Rocket country:"+rocket.country);//literal
		System.out.println("Rocket speed:"+rocket.speed);
		System.out.println("Rocket fuelCapacity:"+rocket.fuelCapacity);
		rocket.setNoOfThrusters(23);
		rocket.print();
		
		Rocket rocket1=new Rocket(30000,550);
		System.out.println("Rocket country1:"+rocket1.country);//literal
		System.out.println("Rocket speed1:"+rocket1.speed);
		System.out.println("Rocket fuelCapacity1:"+rocket1.fuelCapacity);
		rocket.setNoOfThrusters(25);
		rocket.print();
		
		Rocket rocket2=new Rocket(35000,600);
		System.out.println("Rocket country2:"+rocket2.country);//literal
		System.out.println("Rocket speed2:"+rocket2.speed);
		System.out.println("Rocket fuelCapacity2:"+rocket2.fuelCapacity);
		rocket.setNoOfThrusters(28);
		rocket.print();
		
		System.out.println("=====================================================================");
		System.out.println("Starting main in speakerrunner");
		Chocolate chocolate=new Chocolate(300,"silk");
		System.out.println("Chocolate brand:"+chocolate.brand);
		System.out.println("Chocolate price:"+chocolate.price);
		System.out.println("Chocolate flavour:"+chocolate.flavour);
		chocolate.setSize(200);
		chocolate.print();
		
		Chocolate chocolate1=new Chocolate(200,"milk");
		System.out.println("Chocolate brand1:"+chocolate1.brand);
		System.out.println("Chocolate price1:"+chocolate1.price);
		System.out.println("Chocolate flavour1:"+chocolate1.flavour);
		chocolate.setSize(300);
		chocolate.print();
		
		Chocolate chocolate2=new Chocolate(300,"dairy milk");
		System.out.println("Chocolate brand2:"+chocolate2.brand);
		System.out.println("Chocolate price2:"+chocolate2.price);
		System.out.println("Chocolate flavour2:"+chocolate2.flavour);
		chocolate.setSize(100);
		chocolate.print();
		
		System.out.println("=====================================================================");
		System.out.println("Starting main in speakerrunner");
		Projector projector=new Projector("Lcd","white");
		System.out.println("projector company:"+projector.company);
		System.out.println("projector type:"+projector.type);
	    System.out.println("projector color:"+projector.color);
		projector.setWeight(50);
		projector.display();
		
		Projector projector1=new Projector("dlp","green");
		System.out.println("projector company1:"+projector.company);
		System.out.println("projector type1:"+projector.type);
	    System.out.println("projector color1:"+projector.color);
		projector.setWeight(60);
		projector.display();
		
		Projector projector2=new Projector("portable","blue");
		System.out.println("projector company2:"+projector2.company);
		System.out.println("projector type2:"+projector2.type);
	    System.out.println("projector color2:"+projector2.color);
		projector.setWeight(70);
		projector.display();
		
		System.out.println("=====================================================================");
		System.out.println("Starting main in speakerrunner");
	    Paper paper=new Paper(50,2);
		System.out.println("paper thickness:"+paper.thickness);
		System.out.println("paper size:"+paper.size);
		System.out.println("paper quantity:"+paper.quantity);
		paper.setColor("blue");
		paper.display();
		
		Paper paper2=new Paper(60,1);
		System.out.println("paper thickness1:"+paper2.thickness);
		System.out.println("paper size1:"+paper2.size);
		System.out.println("paper quantity1:"+paper2.quantity);
		paper.setColor("blue");
		paper.display();
		
		Paper paper3=new Paper(100,3);
		System.out.println("paper thickness2:"+paper3.thickness);
		System.out.println("paper size2:"+paper3.size);
		System.out.println("paper quantity2:"+paper3.quantity);
		paper.setColor("blue");
		paper.display();
		
	}
}