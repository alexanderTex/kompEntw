package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

//TODO
@ManagedBean(name="toDoListMB", eager=true)
@SessionScoped
public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;

    private ToDoList toDoList;
    
	public ToDoListMB() {
		super();
		//TODO
		toDoList = new ToDoList();
	}    

	//TODO
	public ToDoList getToDoList()
	{
		return toDoList;
	}

	//Should be called if the Button "Speichern" is pushed.
	//Needs configuration in the faces-config.xml.
    public String save() {
    	return "save";
    }
    
	//Should be called if the Button "Edit-Interval" is pushed.
	//Needs configuration in the faces-config.xml.
    public String editInterval() {
    	return "editInterval";
    }
}
