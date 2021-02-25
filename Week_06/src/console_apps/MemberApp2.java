package console_apps;

import model.Member;

public class MemberApp2 {

	public static void main(String[] args) {
		System.out.println("Before creating two members...");
	Member ali = new Member(12345, 's', 100.0);//customized constructor
	System.out.println("After creating member 1");
	Member kaan = new Member(12346, 's', 200.0);
	System.out.println("After creating member 2");
	System.out.println("Member1 and Mamber2 are the same object: " + (ali == kaan));
	System.out.println("Member1 and Mamber2 are distinct object: " + (ali != kaan));
	
	Member veli = new Member("Veli", 123589, 'g', 300.0);
	}

}
