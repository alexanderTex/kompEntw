package de.htw_berlin.ai_bachelor.kbe;

import javax.faces.component.visit.VisitContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import de.htw_berlin.ai_bachelor.kbe.checklist.CountingVisitCallback;



public class MyPhaseListener implements PhaseListener {

	private static final long serialVersionUID = 3L;
	
	public void afterPhase(PhaseEvent arg0) {
		// TODO Auto-generated method stub
		
		if(arg0.getPhaseId() == PhaseId.RESTORE_VIEW)
		{
			if(arg0.getFacesContext().isPostback())
			{
				System.out.println("Ich bin ein Postback!");
			}				
			
			System.out.println("ViewRoot-ID : " + arg0.getFacesContext().getViewRoot().getViewId());
			
			
			CountingVisitCallback cVC = new CountingVisitCallback();
			
			arg0.getFacesContext().getViewRoot().visitTree(VisitContext.createVisitContext(arg0.getFacesContext()), cVC);
			
			System.out.println("View Child Count : " + cVC.getCount());
			
			System.out.println(cVC.printFamilyCount());
			
		}		
		else if(arg0.getPhaseId() == PhaseId.RENDER_RESPONSE)
		{
			System.out.println("ViewRoot-ID : " + arg0.getFacesContext().getViewRoot().getViewId());
			
			CountingVisitCallback cVC = new CountingVisitCallback();
			
			arg0.getFacesContext().getViewRoot().visitTree(VisitContext.createVisitContext(arg0.getFacesContext()), cVC);
			
			System.out.println("View Child Count : " + cVC.getCount());
			
			System.out.println(cVC.printFamilyCount());
			
			//System.out.println("View Child Count : " + arg0.getFacesContext().getViewRoot().getChildCount());
		}
		
		
		System.out.println("After : " + arg0.getPhaseId().getName());

	}

	public void beforePhase(PhaseEvent arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("Before : " + arg0.getPhaseId().getName());
	}

	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		return PhaseId.ANY_PHASE;
	}
}
