package de.htw_berlin.ai_bachelor.kbe.counter;

import org.junit.Test;

public class CounterFactoryTest {

	@Test
	public void incrementCounterSimple(){
		String typ = "simple";
		
		System.out.println("CounterSimple increment test!");
		System.out.println("CounterSimple count before = " + CounterFactory.getCounterInstance(typ).getCounter());
		
		CounterFactory.getCounterInstance(typ).increment();
		
		System.out.println("CounterSimple count after = " + CounterFactory.getCounterInstance(typ).getCounter());
			
	}
	
	@Test
	public void incrementCounterDouble(){
		String typ = "double";
		
		System.out.println("CounterDouble increment test!");
		System.out.println("CounterDouble count before = " + CounterFactory.getCounterInstance(typ).getCounter());
		
		CounterFactory.getCounterInstance(typ).increment();
		
		System.out.println("CounterDouble count after = " + CounterFactory.getCounterInstance(typ).getCounter());
			
	}
	
	@Test
	public void incrementCounterTriple(){
		String typ = "triple";
		
		System.out.println("CounterTriple increment test!");
		System.out.println("CounterTriple count before = " + CounterFactory.getCounterInstance(typ).getCounter());
		
		CounterFactory.getCounterInstance(typ).increment();
		
		System.out.println("CounterTriple count after = " + CounterFactory.getCounterInstance(typ).getCounter());
			
	}
	
	
}
