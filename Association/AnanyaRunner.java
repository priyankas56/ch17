class AnanyaRunner
{
	public static void main(String[] values)
	{
		Knife knife=new Knife(1,35);
		Ananya ananya=new Ananya(776075346,knife);
		ananya.details();
		
		Knife knife1=new Knife(2,25);
		Ananya ananya1=new Ananya(990875659,knife1);
		ananya1.details();
	}
}