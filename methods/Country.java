class Country
{
	String name;
	String continent;
	State state=new State("karnataka","kannada");
	Country()
	{
		System.out.println("craeted country with parameter constuctor");
	}
	Country(String name,String continent)
	{
		this.name=name;
		this.continent=continent;
	}
	public void result()
	{
		
		System.out.println("the country name:"+name);
		System.out.println("the country continenet:"+continent);
		state.result();
	}
}