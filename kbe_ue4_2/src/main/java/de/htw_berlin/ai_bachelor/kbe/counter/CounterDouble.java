package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterDouble implements Counter {

	private int counter=0;
	
	public CounterDouble(){}
	
	public int getCounter() {
		return counter;
	}

	public void increment() {
		counter+=2;
	}

}
