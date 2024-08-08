class KeybunchRunner
{
	public static void main(String[] args)
	{
		Key key=new Key(65,"baldwin");
		Keybunch keybunch=new Keybunch("iron",key);
		keybunch.details();
		
		Key key1=new Key(75,"norton");
		Keybunch keybunch1=new Keybunch("copper",key1);
		keybunch1.details();
	}
}