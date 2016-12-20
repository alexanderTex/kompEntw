package de.htw_berlin.ai_bachelor.kbe.checklist;

import javax.faces.component.UIComponent;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.component.visit.VisitResult;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CountingVisitCallback implements VisitCallback {

	
	private int count = 0;
	
	private HashMap<String, AtomicInteger> familyCount;
	
	
	public CountingVisitCallback()
	{
		super();
		
		familyCount = new HashMap<String, AtomicInteger>();
	}
	
	
	public int getCount()
	{
		return count;
	}
	
	
	public VisitResult visit(VisitContext context, UIComponent target) {
		// TODO Auto-generated method stub
		
		
		if(!familyCount.containsKey(target.getFamily()))
		{
			familyCount.put(target.getFamily(), new AtomicInteger(1));
		}
		else
		{
			familyCount.get(target.getFamily()).incrementAndGet();
			
		}
		
		
		count ++;
		
		return VisitResult.ACCEPT;
	}
	
	
	public String printFamilyCount()
	{
		String s = "";
		
		for(String key : familyCount.keySet())
		{
			s += key + "(Count) : " + familyCount.get(key) + "\n";			
		}
		
		return s;
	}

}
