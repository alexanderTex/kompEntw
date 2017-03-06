package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.io.Serializable;

import javax.validation.constraints.Min;

public class Intervall  implements Serializable {
	private static final long serialVersionUID = 2L;
	
	private int min;
	
	@Min(value=1, message="The max value must be higher than the min")
	private int max;
	
	
	public Intervall() {
		super();
		
		this.min = 1;
		
		this.max = 1;
	}


	public int getMin() {
		return min;
	}


	public int getMax() {
		return max;
	}

	
	public void setMax(int max) {
		this.max = max;
	}
}
