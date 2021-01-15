package console_apps;
import java.util.Scanner;

public class CircleApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * Calculate the first circle.
		 */
		//Step 1: Prompt user for the radius of the first circle
		System.out.println("Enter the radius of the 1st circle:");
		//Declare a variable to store the user input.
		//Step 1: Read a floating number from user.
		double radius1 = input.nextDouble();
		//Step 3: Compute the area of the input circle accordingly.
		double area1 = 3.14 * radius1 * radius1;
		String area1s = String.format("%.2f", area1);
		//Step 4: OUtput the result back to the user.
		System.out.println("Area of circle is: " + area1s);
		
		/*
		 * Calculate the second circle.
		 */
		//Step 1: Prompt user for the radius of the second circle
		System.out.println("Enter the radius of the 2nd circle:");
		//Declare a variable to store the user input.
		//Step 1: Read a floating number from user.
		double radius2 = input.nextDouble();
		//Step 3: Compute the area of the input circle accordingly.
		double area2 = 3.14 * radius2 * radius2;
		String area2s = String.format("%.2f", area2);
		//Step 4: OUtput the result back to the user.
		System.out.println("Area of circle is: " + area2s);
		
		input.close();
		
	}

}
