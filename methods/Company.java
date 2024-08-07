class Company
{
	int id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("priya",5,"manager",70000);
	Company(int id,String name,String location)
	{
		System.out.println("created hotel with para constuctor");
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void print()
	{
		System.out.println("the comany id:"+id);
		System.out.println("the comany name:"+name);
		System.out.println("the comany location:"+location);
		softwareEngineer.print();
	}
}