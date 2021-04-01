package model;

public class Registration {

	private String courseCode;
	private int credit;
	private int mark;

	public Registration(String courseCode, int credit, int mark) {
		this.courseCode = courseCode;
		this.credit = credit;
		this.mark = mark;
	}

	public Registration(String courseCode, int credit) {
		this.courseCode = courseCode;
		this.credit = credit;
	}

	public String getCourseName() {
		return this.courseCode;
	}

	public int getNumberOfCredits() {
		return this.credit;
	}

	public int getMarks() {
		return mark;
	}

	public String getLetterGrade() {

		String grade;

		if (mark >= 90) {
			grade = "A+";
		} else if (mark >= 80) {
			grade = "A";
		} else if (mark >= 70) {
			grade = "B";
		} else if (mark >= 60) {
			grade = "C";
		} else if (mark >= 50) {
			grade = "D";
		} else {
			grade = "F";
		}

		return grade;
	}
	
	public int getWeightedGradePoint() {
		int grade;

		if (mark >= 90) {
			grade = 9;
		} else if (mark >= 80) {
			grade = 8;
		} else if (mark >= 70) {
			grade = 7;
		} else if (mark >= 60) {
			grade = 6;
		} else if (mark >= 50) {
			grade = 5;
		} else {
			grade = 0;
		}
		
		return grade * credit;
	}

	public void setMarks(int newMark) {
		this.mark = newMark;
	}
}
