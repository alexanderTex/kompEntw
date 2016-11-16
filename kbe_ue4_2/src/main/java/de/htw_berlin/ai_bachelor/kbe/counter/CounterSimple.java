package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterSimple implements Counter {

	private int counter=0;
	
	public CounterSimple(){}
	
	public int getCounter() {
		return counter;
	}

	public void increment() {
		counter++;
	}

}
