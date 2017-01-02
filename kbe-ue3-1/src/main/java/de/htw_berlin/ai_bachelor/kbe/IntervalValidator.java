package de.htw_berlin.ai_bachelor.kbe;

import javax.faces.context.FacesContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.el.ELContext;

import de.htw_berlin.ai_bachelor.kbe.checklist.mb.IntervallMB;

public class IntervalValidator implements ConstraintValidator<MyInterval, Integer> {

	@Override
	public void initialize(MyInterval arg0) {
		
	}

	@Override
	public boolean isValid(Integer arg0, ConstraintValidatorContext arg1) {
		
		IntervallMB bean = null;
		FacesContext f = FacesContext.getCurrentInstance();
		if(f != null)
		{
			ELContext e = f.getELContext();
			
			bean = (IntervallMB)e.getELResolver().getValue(e, null, "intervallMB");
		}
		
		if(arg0 >= bean.getIntervall().getMin() && arg0 <= bean.getIntervall().getMax())
		{
			return true;
		}
		return false;
	}

}
