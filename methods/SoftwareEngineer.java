class SoftwareEngineer
{
	String name;
	int experience;
	String designation;
	double salary;
	SoftwareEngineer()
	{
		System.out.println("created string parameter constuctor");
	}
	SoftwareEngineer(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this. designation=designation;
		this.salary=salary;
	}
	public void print()
	{
		System.out.println("SoftwareEngineer name:"+name);
		System.out.println("SoftwareEngineer name:"+experience);
		System.out.println("SoftwareEngineer name:"+designation);
		System.out.println("SoftwareEngineer name:"+salary);
	}
}