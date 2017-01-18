package de.htw_berlin.ai_bachelor.kbe.checklist.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Future;

import de.htw_berlin.ai_bachelor.kbe.MyInterval;

@Entity
@Access(AccessType.FIELD)
public class ToDo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Integer id;

	private String name;
	private boolean done = false;
	
	@Future(message="Das Fälligkeitsdatum muss in der Zukunft liegen")
	private Date date = new Date(); //faelligkeitsdatum
	
	@MyInterval
	private int prio;
	
	public ToDo() {
		super();
		this.name = "";
		this.done = false;	
		
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.DATE, 1);
		
		this.date = c.getTime();
		
		prio = 1;
		
	}
	
	public ToDo(String name, boolean done) {
		super();
		this.name = name;
		this.done = done;	
		
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.DATE, 1);
		
		this.date = c.getTime();
		
		prio = 1;
		
	}
	
	public ToDo(String name) {
		this(name,false);		
	}
	
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDate() {		
       	return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public int getPrio() {		
       	return prio;
	}
	
	public void setPrio(int prio) {
		this.prio = prio;
	}
	
	public Integer getId() {
		return id;
	}

}
