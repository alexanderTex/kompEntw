package de.htw_berlin.ai_bachelor.kbe.tree;

public class ComparePredicate<V extends Comparable<V>> implements TreePredicate<V> {
	private V minEle;
	private V maxEle;
	
	public ComparePredicate(V minEle, V maxEle) {
		this.minEle = minEle;
		this.maxEle = maxEle;
	}
	
	public boolean isOk(Tree<V> t) {
		
		boolean ret = false;
		
		ret = isBetween(t.getValue(), minEle, maxEle); 
		
		return ret;
	}
	
	private boolean isBetween(V t, V min , V max)
	{
		return t.compareTo(min) > 0 &&  t.compareTo(max) < 0 ;
	}
}
