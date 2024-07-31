class LensRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in lensrunner");
		Lens lens=new Lens("cylindrical",200);
		System.out.println("lens name:"+lens.name);
		System.out.println("lens price:"+lens.price);
		
		Lens lens1=new Lens("prime lens",250);
		System.out.println("lens name:"+lens.name);
		System.out.println("lens price:"+lens.price);
		
		Lens lens2=new Lens("telephoto lens",800);
		System.out.println("lens name:"+lens2.name);
		System.out.println("lens price:"+lens2.price);
		
		Lens lens3=new Lens("concave lens",600);
		System.out.println("lens name:"+lens3.name);
		System.out.println("lens price:"+lens3.price);
		
		Lens lens4=new Lens("marco",500);
		System.out.println("lens name:"+lens4.name);
		System.out.println("lens price:"+lens4.price);
		
		Lens lens5=new Lens("tilt shift",900);
		System.out.println("lens name:"+lens5.name);
		System.out.println("lens price:"+lens5.price);
		
		Lens lens6=new Lens("aspherical lens",650);
		System.out.println("lens name:"+lens6.name);
		System.out.println("lens price:"+lens6.price);
		
		Lens lens7=new Lens("canon",750);
		System.out.println("lens name:"+lens7.name);
		System.out.println("lens price:"+lens7.price);
		
		Lens lens8=new Lens("convex",850);
		System.out.println("lens name8:"+lens.name);
		System.out.println("lens price8:"+lens.price);
		
		Lens lens9=new Lens("kit lenses",920);
		System.out.println("lens name:"+lens9.name);
		System.out.println("lens price:"+lens9.price);
		
		Lens lens10=new Lens("meniscus",200);
		System.out.println("lens name10:"+lens.name);
		System.out.println("lens price10:"+lens.price);
	}
}