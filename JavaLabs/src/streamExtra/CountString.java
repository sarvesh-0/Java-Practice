//Write a Java program to count the number of strings in a list that start with a specific letter using streams.
package streamExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountString {

	public static void main(String[] args) {
		List <String> lis = new ArrayList<>(Arrays.asList("Sarvesh","Tejas","Aditya","Shivam","Abhishek","Shubham"));
		long res = lis.stream()
							.filter(val -> val.startsWith(String.valueOf('S')))
							.count();
		
		System.out.println("Number of Words Starting with S are "+res);
	}

}
