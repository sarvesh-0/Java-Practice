//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

package streamExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
	public static void main(String[] args) {
		List <Integer> lis = new ArrayList <Integer> (Arrays.asList(1,2,3,4,5,6,7,8,9));
		Map <Boolean,Integer> eo = lis.stream()
									.collect(Collectors.partitioningBy(val -> val % 2 == 0,
									Collectors.summingInt(Integer::intValue )));
		int esum = eo.get(true);
		int osum = eo.get(false);
		
		System.out.println("Sum of Even Number = "+esum);
		System.out.println("Sum of Odd Number  = "+osum);
		
	}
}


//// Sum of even numbers using Collectors.summingInt
//int eSum = lis.stream()
//              .filter(val -> val % 2 == 0)
//              .collect(Collectors.summingInt(Integer::intValue));
//
//// Sum of odd numbers using Collectors.summingInt
//int oSum = lis.stream()
//              .filter(val -> val % 2 != 0)
//              .collect(Collectors.summingInt(Integer::intValue));
 



//// Sum of even numbers using reduce
//int eSum = lis.stream()
//              .filter(val -> val % 2 == 0)
//              .reduce(0, (subtotal, element) -> subtotal + element);
//
//// Sum of odd numbers using reduce
//int oSum = lis.stream()
//              .filter(val -> val % 2 != 0)
//              .reduce(0, (subtotal, element) -> subtotal + element);




//int eSum = lis.stream()
//.filter(val -> val % 2 == 0)
//.mapToInt(Integer::intValue)
//.sum();  // Correct way to sum the even numbers