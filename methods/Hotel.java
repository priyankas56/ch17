class Hotel
{
	String name="pride";
	Owner owner=new Owner("raj",21,"male");
	
	public void display()
	{
		System.out.println("the hotel name:"+name);
		Owner.display();
	}
}