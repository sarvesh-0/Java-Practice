package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> ans = list.stream()
							.limit(3)
							.collect(Collectors.toList());
		System.out.println(Arrays.toString(ans.toArray()));
	}

}
