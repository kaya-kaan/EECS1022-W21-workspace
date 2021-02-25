package model;

public class Member {

	/* 
	 * Attributes (class-level variable; all methods can access them)
	 */
	private int id;
	private char type;
	private double balance;
	
	private String name;
	
	private double weight;
	private double height;
	/*
	 * Constructors (create instances of the current class)
	 */
	public Member() {
		
	}
	
	
	public Member(int id, char type, double balance) {
		this.id = id;
		this.type = type;
		this.balance = balance;
	}
	
	public Member(String name, int id, char type, double balance) {
		this(id, type, balance);
		this.name = name;
	}
	
	public Member(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	
	/*
	 * Accessor methods (returning some useful methods)
	 */
	public double getWeight() {
		return this.weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getBMIReport() {
		String result = "";
		
		double heightInMeters = this.height / 100;
		double bmi = this.weight / (heightInMeters * heightInMeters);
		
		String interpretation = "";
		if(bmi < 18.5) {
			interpretation = "Underweight";
		} else if (bmi < 25.0) {
			interpretation = "Normal";
		} else if (bmi < 30.0) {
			interpretation = "Overweight";
		} else {
			interpretation = "Obese";
		}
		result = interpretation + " (" + String.format("%.1f", bmi) + ")";
		return result;
	}
	
	/*
	 * Mutator methods (not returning anything)
	 */
	public void changeWeightBy(double units) {
		this.weight += units;
	}
	
	
	
}
