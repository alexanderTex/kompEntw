package de.htw_berlin.ai_bachelor.kbe.checklist.dao;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;

public class ToDoFacade {
	
	private ToDoDAO dao;
	
	public ToDoFacade(){
		dao = new ToDoDAO(ToDo.class);
	}

	
	public void saveToDo(ToDo tD){
		
		dao.beginTransaction();
		dao.save(tD);
		dao.commitAndCloseTransaction();
	}
	
	public ToDo readToDo(int id){
		dao.beginTransaction();
		ToDo ret = dao.find(id);
		dao.closeTransaction();		
		return ret;
	}
	
	public void deleteToDo(int id){
		dao.beginTransaction();
		
		ToDo tD = dao.find(id);
		
		dao.delete(tD.getId(), ToDo.class);
		
		dao.commit();
		
		dao.closeTransaction();
	}
	
	public void updateToDo(ToDo tD){
		dao.beginTransaction();
		ToDo ref = dao.find(tD.getId());
		
		ref.setDate(tD.getDate());
		ref.setDone(tD.isDone());
		ref.setName(tD.getName());
		ref.setPrio(tD.getPrio());
		
		dao.commit();
		
		dao.closeTransaction();
	}
	
	
}
