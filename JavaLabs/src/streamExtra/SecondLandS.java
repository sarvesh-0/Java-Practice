//Write a Java program to find the second smallest and largest elements in the list of integer using stream
package streamExtra;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLandS {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2, 10, 4, 6, 7);
		List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());

		int secondSmallest = sortedNumbers.get(1);  // Get the second smallest
		int secondLargest = sortedNumbers.get(sortedNumbers.size() - 2);  // Get the second largest

		System.out.println("Second smallest value: " + secondSmallest);
		System.out.println("Second largest value: " + secondLargest);
	}
}
