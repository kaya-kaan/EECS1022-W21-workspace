package model;

public class Instructor {

	public String name;
	public int campusPhone;
	public String email;
	
	public Instructor(String name, int phone, String email) {
		this.name = name;
		campusPhone = phone;
		this.email = email;
	}
	
	//GETTERS
	
	public String getName() {
		return name;
	}
	
	public int getPhoneExtension() {
		return campusPhone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getInformation() {
		String info = "";
		info += "Instructor " + name + " has campus phone extension " + campusPhone + " and contact email " + email;
		return info;
	}
	
	//SETTERS
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneExtension(int phone) {
		campusPhone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
