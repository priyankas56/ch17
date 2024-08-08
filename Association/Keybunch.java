class Keybunch
{
	Key key;
	String material;
    public Keybunch(String material,Key key)
	{
		System.out.println("created keybunch with key and material");
		this.key=key;
		this.material=material;
	}
	public void details()
	{
		System.out.println("the keybunch material:"+material);
		key.display();
	}
}