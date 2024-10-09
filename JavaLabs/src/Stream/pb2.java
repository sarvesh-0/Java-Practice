//2. Create an AraryList of 7 integers. Multiply every element by 5. Display the numbers.
package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class pb2 {

	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		List<Integer> res = lis.stream()
							.map(val -> val * 5)
							.collect(Collectors.toList());
		System.out.println(Arrays.toString(res.toArray()));
	}

}
