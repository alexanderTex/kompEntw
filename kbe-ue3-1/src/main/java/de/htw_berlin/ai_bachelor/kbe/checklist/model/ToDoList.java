package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ToDoList implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	private List<ToDo> toDos =  new ArrayList<ToDo>();
	
	
	public ToDoList() {
		super();
		this.setToDos();
	}
	
	
	public List<ToDo> getToDos() {
		return toDos;
	}
	
	public int getToDoCount()
	{
		return toDos.size();
	}
	
	public int toDoCountDone()
	{
		int ret=0;
		for (int i = 0; i < getToDoCount(); i++)
		{
			if(this.toDos.get(i).isDone() == true)
				ret++;
		}
		return  ret;
	}

	private void setToDos() {
		toDos.add(new ToDo("KBE: Aufgabenzettel 2 bearbeiten"));
		toDos.add(new ToDo("KBE: Zweite Vorlesung nacharbeiten"));
		toDos.add(new ToDo("Lebensmittel einkaufen "));
		toDos.add(new ToDo("Leergut wegbringen"));
		toDos.add(new ToDo("Geburtstagsgeschenk besorgen"));
		toDos.add(new ToDo("Putzen"));
	}
}
