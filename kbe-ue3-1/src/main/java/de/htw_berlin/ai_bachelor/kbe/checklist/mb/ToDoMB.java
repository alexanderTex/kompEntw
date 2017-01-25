package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.htw_berlin.ai_bachelor.kbe.checklist.dao.ToDoFacade;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;

@Named
//@ManagedBean(name="toDoMB", eager=true)
@RequestScoped
public class ToDoMB implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//@Inject
	private ToDo toDo;
	@Inject
	private ToDoFacade facade;
	
	public ToDoMB() {
		super();
		
		
		toDo = new ToDo();
	}

	public ToDo getToDo() {
		return toDo;
	}	
	
	public String save(){
		if(facade == null)
		{
			System.out.println("FACADE IS NULL");
		}
		else
		{
			facade.saveToDo(toDo);
		}
		return "save";
	}
	
	public String cancel(){		
		return "cancel";
	}

}
