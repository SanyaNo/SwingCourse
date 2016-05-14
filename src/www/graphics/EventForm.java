package www.graphics;

import java.util.EventObject;

public class EventForm extends EventObject {
	
	private String name;
	private String occupation;

	public EventForm(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}
	
	public EventForm(Object source, String name, String occupation) {
		super(source);
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.occupation = occupation;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

}
