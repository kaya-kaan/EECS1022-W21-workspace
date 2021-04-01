package model;

public class Transcript {

	private static int i = 3;
	private String id;
	private String name;
	Registration[] registrations = new Registration[60];
	private int numberRegistered = 0;

	public Transcript(String name) {
		this.name = name;
		this.id = name + i;
		this.i += 3;
	}

	public void addRegistration(Registration reg) {
		registrations[numberRegistered] = reg;
		numberRegistered++;
	}

	public void addRegistration(String name, int credit) {
		Registration reg = new Registration(name, credit);
		registrations[numberRegistered] = reg;
		numberRegistered++;
	}

	public void addRegistration(String name, int credit, int mark) {
		Registration reg = new Registration(name, credit, mark);
		registrations[numberRegistered] = reg;
		numberRegistered++;
	}

	public void addRegistrations(Registration[] regs) {
		for (int i = 0; i < regs.length; i++) {
			registrations[numberRegistered] = regs[i];
			numberRegistered++;
		}
	}

	public String getStudentID() {
		return this.id;
	}

	public Registration[] getReport() {
		Registration[] regs = new Registration[numberRegistered];

		for (int i = 0; i < numberRegistered; i++) {
			regs[i] = this.registrations[i];
		}

		return regs;
	}

	public int getMarks(String code) {
		int regIndex = -1;

		for (int i = 0; i < numberRegistered; i++) {
			if (registrations[i].getCourseName() == code) {
				regIndex = i;
			}
		}
		if (regIndex == -1) {
			return -1;
		} else {
			return registrations[regIndex].getMarks();
		}

	}
	
	public double getWeightedGPA() {
		double sumWeightedGP = 0;
		
		for (int i = 0; i < numberRegistered; i++) {
			sumWeightedGP += registrations[i].getWeightedGradePoint();
		}
		
		return sumWeightedGP / numberRegistered;		
	}

	public void setMarks(String name, int mark) {
		int regIndex = -1;

		for (int i = 0; i < numberRegistered; i++) {
			if (registrations[i].getCourseName() == name) {
				regIndex = i;
			}
		}
		if (regIndex == -1) {
			
		} else {
			registrations[regIndex].setMarks(mark);
		}
	}
}
