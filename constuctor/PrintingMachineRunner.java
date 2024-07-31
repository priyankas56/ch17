class PrintingMachineRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in printingmachinerunner");
		PrintingMachine printingMachine=new PrintingMachine("digital",30000);
		System.out.println("PrintingMachine type:"+printingMachine.type);
		System.out.println("PrintingMachine price:"+printingMachine.price);
		
		PrintingMachine printingMachine1=new PrintingMachine("ink-jet",40000);
		System.out.println("PrintingMachine type:"+printingMachine1.type);
		System.out.println("PrintingMachine price:"+printingMachine1.price);
		
		PrintingMachine printingMachine2=new PrintingMachine("screen printers",50000);
		System.out.println("PrintingMachine type:"+printingMachine2.type);
		System.out.println("PrintingMachine price:"+printingMachine2.price);
		
		PrintingMachine printingMachine3=new PrintingMachine("flexographic",60000);
		System.out.println("PrintingMachine type:"+printingMachine3.type);
		System.out.println("PrintingMachine price:"+printingMachine3.price);
		
		PrintingMachine printingMachine4=new PrintingMachine("digital",70000);
		System.out.println("PrintingMachine type:"+printingMachine4.type);
		System.out.println("PrintingMachine price:"+printingMachine4.price);
		
		PrintingMachine printingMachine5=new PrintingMachine("letterpress",75000);
		System.out.println("PrintingMachine type:"+printingMachine5.type);
		System.out.println("PrintingMachine price:"+printingMachine5.price);
		
		PrintingMachine printingMachine6=new PrintingMachine("offset",65000);
		System.out.println("PrintingMachine type:"+printingMachine6.type);
		System.out.println("PrintingMachine price:"+printingMachine6.price);
		
		PrintingMachine printingMachine7=new PrintingMachine("laser",68000);
		System.out.println("PrintingMachine type:"+printingMachine7.type);
		System.out.println("PrintingMachine price:"+printingMachine7.price);
		
		PrintingMachine printingMachine8=new PrintingMachine("wireless",74000);
		System.out.println("PrintingMachine type:"+printingMachine8.type);
		System.out.println("PrintingMachine price:"+printingMachine8.price);
		
		PrintingMachine printingMachine9=new PrintingMachine("thermographic",73000);
		System.out.println("PrintingMachine type:"+printingMachine9.type);
		System.out.println("PrintingMachine price:"+printingMachine9.price);
		
		PrintingMachine printingMachine10=new PrintingMachine("pad printer",82000);
		System.out.println("PrintingMachine type:"+printingMachine10.type);
		System.out.println("PrintingMachine price:"+printingMachine10.price);
		System.out.println("end main in printingmachinerunner");
	}
}