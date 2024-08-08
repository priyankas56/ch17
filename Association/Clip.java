class Clip
{
	String color;
	String type;
	public Clip(String color,String type)
	{
		System.out.println("created clip using color and type");
		this.color=color;
		this.type=type;
	}
	public void print()
	{
		System.out.println("clip color:"+color);
		System.out.println("clip type:"+type);

	}
}