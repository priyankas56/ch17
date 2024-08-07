class CapitalCity
{
	String name;
	long population;
	CapitalCity()
	{
		System.out.println("created capitalcity with parameter constuctor");
	}
	CapitalCity(String name,long population)
	{
		this.name=name;
		this.population=population;
	}
	public void result()
	{
		System.out.println("the capitalcity name:"+name);
		System.out.println("the capitalcity population:"+population);
	}
}