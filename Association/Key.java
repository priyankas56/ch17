class Key
{
	int weight;
	String brand;
	public Key(int weight,String brand)
	{
		System.out.println("created key with weight and brand");
		this.weight=weight;
		this.brand=brand;
	}
	public void display()
	{
		System.out.println("key weight:"+weight);
		System.out.println("key brand:"+brand);
	}
}