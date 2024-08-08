class Ananya
{
	Knife knife;
	long mobile;
	public Ananya(long mobile,Knife knife)
	{
		System.out.println("created ananya using knife n mobile");
		this.knife=knife;
		this.mobile=mobile;
	}
	public void details()
	{
	System.out.println("ananya mobile:"+mobile);
    knife.print();
	}
}
