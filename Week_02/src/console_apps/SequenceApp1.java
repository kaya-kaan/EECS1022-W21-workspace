package console_apps;

import java.util.Scanner;

public class SequenceApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Stage 1: Prompt the user and read inputs
		System.out.println("Enter the first term (FT) of an arithmetic seq. of size 5:");
		int ft = input.nextInt();
		System.out.println("Enter the common difference (d):");
		int d = input.nextInt();
		
		//Stage 2: Compute the result
		int term1 = ft;
		int term2 = ft + d; //term1 + d
		int term3 = ft + 2 * d;
		int term4 = ft + 3 * d;
		int term5 = ft + 4 * d;
		
		String seq = "<" + term1 + ", " + term2 + ", " + term3 + ", " + term4 + ", " + term5 + ">";
		int sum = term1 + term2 + term3 + term4 + term5;
		
		//Stage 3: Output the result to console
		System.out.println("Sequence " + seq + " has sum " + sum);
		
		
		input.close();
		

	}

}
