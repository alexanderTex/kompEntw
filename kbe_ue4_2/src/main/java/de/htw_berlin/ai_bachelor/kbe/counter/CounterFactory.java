package de.htw_berlin.ai_bachelor.kbe.counter;

public final class CounterFactory {

	private static CounterSimple cSimple=new CounterSimple();
	private static CounterDouble cDouble=new CounterDouble();
	private static CounterTriple cTriple=new CounterTriple();
	
	public CounterFactory()
	{
		
	}
	
	
	public static Counter getCounterInstance(String type)
	{
		Counter c = null;
		
		if(type.equals("simple"))
		{
			c=cSimple;
		}
		else if(type.equals("double"))
		{
			c=cDouble;
		}
		else if(type.equals("triple"))
		{
			c=cTriple;
		}
		else
		{
			
		}
			
		return c;
	}
	
}
