import model.Car;
import model.Student;
import model.Account;
import model.Client;
//import model.Person;
import java.util.ArrayList;
import java.util.HashMap;

public class TestingClass {
	public static void main(String args[]) {

	int k = 4;

			int sum = 0;

			int[] value = {1, 3, 4, 6, 8, 9, 13, 15, 18, 21 }; 
			for (int i = 0; i < value.length - k; i++) 
				if (value[i] % 3 == 0) {

			sum += value [i];
				}

			System.out.println(sum);

	//System.out.println(a[a.length-1]);		
}
}
