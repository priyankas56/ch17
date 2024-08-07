class State
{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("kankapura",8056344);
	State()
	{
		System.out.println("craeted state with parameter constuctor");
	}
	State(String name,String language)
	{
		this.name=name;
		this.language=language;
	}
	public void result()
	{
		System.out.println("the state name:"+name);
		System.out.println("the state language:"+language);
		capitalCity.result();
	}
	
}
