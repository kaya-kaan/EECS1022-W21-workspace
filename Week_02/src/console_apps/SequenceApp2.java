package console_apps;

import java.util.Scanner;

public class SequenceApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Stage 1: Prompt the user and read inputs
		System.out.println("Enter the first term (FT) of an arithmetic seq. of size 5:");
		int ft = input.nextInt();
		System.out.println("Enter the common difference (d):");
		int d = input.nextInt();
		
		//Stage 2: Compute the result
		String seq = "<" + ft + ", " + (ft + d) + ", " + (ft + 2 * d) + ", " + (ft + 3 * d) + ", " + (ft + 4 * d) + ">";
		int sum = 5 * ft + (1 + 2 + 3 + 4) * d;
		
		//Stage 3: Output the result to console
		System.out.println("Sequence " + seq + " has sum " + sum);
		
		
		input.close();
		

	}

}
