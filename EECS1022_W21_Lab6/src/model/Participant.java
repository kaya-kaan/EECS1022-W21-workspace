package model;

public class Participant {

	public String name;
	public Registration[] registrations = new Registration[5];
	private int regCounter = 0;
	
	public Participant() {
		
	}
	
	public Participant(String name) {
		this.name = name;
	}

	public int marksOf(String name) {
		int mark = -1;
		for(int i = 0 ; i < 5 ; i++) {
			if(name == registrations[i].title) {
				mark = registrations[i].mark;
			}
		}
		
		return mark;
	}

	public void addRegistration(Registration registration) {
		
		if(regCounter < 5) {
			registrations[regCounter] = registration;
			regCounter++;
		}
		
	}

	public void addRegistration(String name) {
//		if(regCounter == 0) {
//			registrations = new Registration[5];
//		}
		
		if(regCounter < 5) {
			registrations[regCounter] = new Registration(name);
			regCounter++;
		}
		
	}
	
	public void updateMarks(String name, int updatedMark) {
		for(int i = 0 ; i < 5 ; i++) {
			if(name == registrations[i].title) {
				registrations[i].mark = updatedMark;
			}
		}
	}
	
	public void clearRegistrations() {
		for(int i = 0 ; i < 5 ; i++) {
			registrations[i] = null;
		}

	}
	// GETTERS

	public Registration[] getRegistrations() {
		return this.registrations;
	}

	public String getGPAReport() {

		return "No GPA available yet for S. Y. Lee";
	}

	// SETTERS
}
