package model;

public class Registration {

	public String title;
	public int mark = 0;
	public Instructor instructor;

	public Registration(String name) {
		title = name;
	}
	
	public Registration(String name, Instructor instructor) {
		title = name;
		this.instructor = instructor;
	}

	// GETTERS
	
	public String getTitle() {
		return title;
	}

	public int getMarks() {
		return mark;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public String[] getGradeReport() {
		String letterGrade = "";
		String qualitative = "";

		if (mark >= 90 && mark <= 100) {
			letterGrade = "A+";
			qualitative = "Exceptional";
		} else if (mark >= 80 && mark < 90) {
			letterGrade = "A";
			qualitative = "Excellent";
		} else if (mark >= 70 && mark < 80) {
			letterGrade = "B";
			qualitative = "Good";
		} else if (mark >= 60 && mark < 70) {
			letterGrade = "C";
			qualitative = "Competent";
		} else if (mark >= 50 && mark < 60) {
			letterGrade = "D";
			qualitative = "Passing";
		} else if (mark >= 0 && mark < 50) {
			letterGrade = "F";
			qualitative = "Failing";
		}
		String[] report = { letterGrade, qualitative };

		return report;
	}

	public String getInformation() {
		String info = "";
		String[] markInfo = getGradeReport();
		if (instructor == null) {
			info = title + " has not yet been assigned an instructor";
		} else {
			info = title + ", taught by " + instructor.name + ", is completed with raw marks " + mark + " ("
					+ markInfo[0] + " ; " + markInfo[1] + ")";
		}
		return info;
	}

	// SETTERS

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void setMarks(int mark) {
		this.mark = mark;
	}
}
