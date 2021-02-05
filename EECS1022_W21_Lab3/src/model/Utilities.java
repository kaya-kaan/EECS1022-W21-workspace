package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		int count = 0;
		String numbersBetween = "";
		int originalLower = lower;
		
		if (lower < 0 || upper < 0) {
			result = "Error: both bounds must be non-negative";
			
		} else if ( lower > upper) {
			result = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
			
		} else {
			
			while (lower <= upper) {
				if (count > 0) {
					numbersBetween = numbersBetween + ", ";
				}
				
				if ((lower % 3) == 0) {
					numbersBetween = numbersBetween + "(" + lower + ")";
				} else if ((lower % 3) == 1) {
					numbersBetween = numbersBetween + "[" + lower + "]";
				} else if ((lower % 3) == 2) {
					numbersBetween = numbersBetween + "{" + lower + "}";
				}
				count++;
				lower++;
			}
			if (count > 1) {
				result = count + " numbers between " + originalLower + " and " + upper + ": <" + numbersBetween + ">";
			} else {
				result = count + " number between " + originalLower + " and " + upper + ": <" + numbersBetween + ">";
			}
			 	
		}		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int currentTerm = 0;
		int sumOfTerms = 0;
		String terms = "";
		result += "{";
		
		for (int i = 1 ; i <= n ; i++) {
			currentTerm = ft + ((i - 1) * d);
			sumOfTerms += currentTerm;
			
			if ( i >= 2) {
				result += ", "; 
				terms += ", " + currentTerm;
			} else {
				terms += currentTerm;
			}
			
			result += "[sum of <" + terms + ">: " + sumOfTerms + " ; avg of <" + terms + ">: " + String.format("%.2f", (sumOfTerms / (i * 1.0))) + "]";
			
		}
		
		result += "}";
		/* Your implementation ends here. */
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		return result;
	}	
}
