//1. Create an AraryList of 7 integers. Filter the elements that are divisible by 5. Display the numbers.
package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pb1 {

	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<>(Arrays.asList(5,42,60,50,7,80,92));
		List<Integer> res = lis.stream()
							.filter(val -> val % 5 == 0)
							.collect(Collectors.toList());
		System.out.println(Arrays.toString(res.toArray()));
	}

}
