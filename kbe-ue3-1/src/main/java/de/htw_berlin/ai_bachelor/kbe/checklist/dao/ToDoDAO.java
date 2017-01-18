package de.htw_berlin.ai_bachelor.kbe.checklist.dao;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;

public class ToDoDAO extends GenericDAO<ToDo> {
	private static final long serialVersionUID = 1L;

	public ToDoDAO() {
		super(ToDo.class);
		
	}
}
