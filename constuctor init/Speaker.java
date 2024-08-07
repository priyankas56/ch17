class Speaker
{
	String brand="sony";
	int size;
	double cost;
	String output;
	public Speaker(int sizeLocal,double cost)
	{
		System.out.println("Created speaker brand size cost");
		size=sizeLocal;
		this.cost=cost;
	}
	public void setOutput(String output)
	{
		System.out.println("Created speaker setOutput");
		this.output=output;
	}
     public void display()
	 {
		 System.out.println("speaker output:"+this.output);
	 }	 
}

