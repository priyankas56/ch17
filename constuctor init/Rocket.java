class Rocket
{
	String country="india";
	double speed;
	int fuelCapacity;
	int noOfThrusters;
	public Rocket(double speedLocal,int fuelCapacity)
	{
		System.out.println("Created Rocket country speed fuelcapacity");
	     speed=speedLocal;
		 this.fuelCapacity=fuelCapacity;
	}
	public void setNoOfThrusters(int noOfThrusters)
	{
		System.out.println("Created Rocket noOfThrusters");
		this.noOfThrusters=noOfThrusters;
	}
     public void print()
	 {
		 System.out.println("speaker output:"+this.noOfThrusters);
	 }	 
}