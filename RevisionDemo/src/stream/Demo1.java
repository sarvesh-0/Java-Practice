package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Demo1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> res = list.stream()
							.filter(value -> value % 2 ==0) //used for filtering task
							.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(res.toArray()));
	}
}
