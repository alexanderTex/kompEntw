package de.htw_berlin.ai_bachelor.kbe.checklist.dao;



import javax.enterprise.context.ApplicationScoped;


import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;

@ApplicationScoped
public class ToDoDAO extends GenericDAO<ToDo> {
	private static final long serialVersionUID = 1L;

	public ToDoDAO() {
		super(ToDo.class);
		System.out.println("ToDoDAO Const");
	}
}
