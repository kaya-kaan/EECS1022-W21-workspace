package console_apps;

import model.Person;

public class TestingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p0 = new Person("Suyeon");
		Person p1 = new Person("Yuna");
		Person p2 = new Person("Sunhye");
		Person p3 = new Person("Jihye");
		p2 = p3;
		p0 = p1;
		Person[] persons = {p2, p3, p0, p1};
		p2 = persons[3];
		persons[0] = p1;
		System.out.println("Done");


	}

}
