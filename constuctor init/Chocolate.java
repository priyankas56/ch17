class Chocolate
{
	String brand="kit kat";
	double price;
	String flavour;
	int size;
	public Chocolate(double priceLocal,String flavour)
	{
		System.out.println("Created chocolate brand price flavour");
	    price=priceLocal;
		this.flavour=flavour;
	}
	public void setSize(int size)
	{
		System.out.println("Created Chocolate size");
		this.size=size;
	}
     public void print()
	 {
		 System.out.println("speaker output:"+this.size);
	 }	 
}

class Projector
{
	String company="bell";
	String type;
	String color;
	int weight;
	public Projector(String typeLocal,String color)
	{
		System.out.println("created projector company type color");
		type=typeLocal;
		this.color=color;
	}
	public void setWeight(int weight)
	{
		System.out.println("created projector weight");
		this.weight=weight;
	}
	public void display()
	{
		System.out.println("projector weight:"+this.weight);
	}
}

class Paper
{
	String thickness="strong";
	int size;
	int quantity;
	String color;
	public Paper(int sizeLocal,int quantity)
	{
		System.out.println("created paper thickness size quantity");
	    size=sizeLocal;
		this.quantity=quantity;
	}
	public void setColor(String color)
	{
		System.out.println("created projector color");
		this.color=color;
	}
	public void display()
	{
		System.out.println("projector weight:"+this.color);
	}
}