package model;

public class Student {


		static int globalCounter = 1;

		static String id = "yu";

		String name;

		Student (String name) {

		this.id = this.id + globalCounter;

		globalCounter++;

		this.name = name;

		}

		public String toString() { return name + " has id " + id;

		 }

		
}
