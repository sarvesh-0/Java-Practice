//Write Java program to find the maximum and minimum values in a list of integers using streams.
package streamExtra;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2, 10, 4, 6, 7);
		
		Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);

		Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);

	}

}
