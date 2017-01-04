package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;



import javax.faces.bean.ApplicationScoped;

import java.text.SimpleDateFormat;

import java.util.Calendar;


@ManagedBean(name="dateTimeMB", eager=true)
@ApplicationScoped
public class DateTimeMB implements Serializable{
	
	private static final long serialVersionUID = 2L;
	
	public DateTimeMB() {
		super();
	}    
	
	public String getTime(){
	    String time;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        time = sdf.format(cal.getTime());
        return time; //sdf.format(cal.getTime());
	}
	
	public String getTomorrow(){
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.DATE, 1);
		
		Date date = c.getTime();
		
		return date.toString();
	}
	
}
