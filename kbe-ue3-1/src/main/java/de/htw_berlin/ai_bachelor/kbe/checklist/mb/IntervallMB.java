package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.Intervall;

import javax.enterprise.context.ApplicationScoped;

@Named
//@ManagedBean(name="intervallMB", eager=true)
@ApplicationScoped
public class IntervallMB implements Serializable {
	
	private static final long serialVersionUID = 2L;
	
	private Intervall intervall;
	
	public IntervallMB() {
		super();
		//TODO
		intervall = new Intervall();
	}    

	//TODO
	public Intervall getIntervall()
	{
		return intervall;
	}
	
	//Should be called if the Button "Speichern" is pushed.
	//Needs configuration in the faces-config.xml.
    public String save() {
    	return "save";
    }
	
	
}
