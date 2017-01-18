package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;
import java.util.ArrayList;

import de.htw_berlin.ai_bachelor.kbe.checklist.dao.ToDoFacade;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;

@ManagedBean(name="toDoListMB", eager=true)
@SessionScoped
public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;

	private ToDoFacade facade;
	
    private ToDoList toDoList;
    
	public ToDoListMB() {
		super();
		toDoList = new ToDoList();
		
		facade = new ToDoFacade();
	}    

	public ToDoList getToDoList()
	{
		
		ArrayList<ToDo> todos = (ArrayList<ToDo>) facade.getAllToDos();
		
		toDoList = new ToDoList();
		
		for(int i = 0; i < todos.size(); i++)
		{
			toDoList.addToDo(todos.get(i));
		}		
		
		return toDoList;
	}

	//Should be called if the Button "Speichern" is pushed.
	//Needs configuration in the faces-config.xml.
   public String save() {	   
    	for(int i = 0; i < toDoList.getToDoCount(); i++)
    	{
    		facade.updateToDo(toDoList.getToDos().get(i));
    	}
    	
    	
    	return "save";
    }
    
	//Should be called if the Button "Edit-Interval" is pushed.
	//Needs configuration in the faces-config.xml.
    public String editInterval() {
    	return "editInterval";
    }
    
	//Should be called if the Button "Edit-Interval" is pushed.
	//Needs configuration in the faces-config.xml.
    public String editToDo() {
    	return "editToDo";
    }
}
