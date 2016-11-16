package de.htw_berlin.ai_bachelor.kbe.counter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterFactoryTest {

	@Test
	public void incrementCounterSimple(){
		String typ = "simple";
		
		
		assertEquals(CounterFactory.getCounterInstance(typ).getClass(), CounterSimple.class);
		/*
		CounterFactory.getCounterInstance(typ).increment();
		
		assertEquals(CounterFactory.getCounterInstance(typ).getCounter(), 1);
		*/
	}
	
	@Test
	public void incrementCounterDouble(){
		String typ = "double";
		
		assertEquals(CounterFactory.getCounterInstance(typ).getClass(), CounterDouble.class);
		
		/*
		CounterFactory.getCounterInstance(typ).increment();
		
		assertEquals(CounterFactory.getCounterInstance(typ).getCounter(), 2);
		*/	
	}
	
	@Test
	public void incrementCounterTriple(){
		String typ = "triple";
		
		assertEquals(CounterFactory.getCounterInstance(typ).getClass(), CounterTriple.class);
		
		/*
		CounterFactory.getCounterInstance(typ).increment();
		
		assertEquals(CounterFactory.getCounterInstance(typ).getCounter(), 3);
		*/	
	}
	
	
}
