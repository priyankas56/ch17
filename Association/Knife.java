class Knife
{
	int weight;
	int height;
	public Knife(int weight,int height)
	{
		System.out.println("created knife using weight and height");
		this.weight=weight;
		this.height=height;
	}
	public void print()
	{
		System.out.println("knife weight:"+weight);
		System.out.println("knife height:"+height);

	}
}