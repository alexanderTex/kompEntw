package de.htw_berlin.ai_bachelor.kbe.counter;

public class CounterTriple implements Counter {

	private int counter=0;
	
	public CounterTriple(){}
	
	public int getCounter() {
		return counter;
	}

	public void increment() {
		counter+=3;
	}

}
