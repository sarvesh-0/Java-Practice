package stream;

import java.util.stream.Stream;

public class Demo6 {
	public static void main(String[] args) {
		System.out.println("parallel stream and foreach:");
		Stream.of("AAA","BBB","CCC")
		.parallel()
		.forEach(x -> System.out.println("Value: "+x));
		
		System.out.println();
		
		System.out.println("parallel stream and foreachOrdered:");
		Stream.of("AAA","BBB","CCC")
		.parallel()
		.forEachOrdered(x -> System.out.println("Value: "+x));
	}
}
