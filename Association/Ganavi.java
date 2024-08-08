class Ganavi
{
	Clip clip;
	String email;
	public Ganavi(String email,Clip clip)
	{
		System.out.println("created ganavi using clip and email");
		this.clip=clip;
		this.email=email;
	}
	public void print()
	{
	clip.print();
	System.out.println("Ganavi email:"+email);
	}
}
