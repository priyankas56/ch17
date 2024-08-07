class Owner
{
	String name;
	int age;
	String gender;
	Owner()
	{
		System.out.println("creared owner name age and gender");
	}
	Owner(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void display()
	{
		System.out.println("the owner name:"+this.name);
		System.out.println("the owner age:"+this.age);
		System.out.println("the owner gender:"+this.gender);
	}
}