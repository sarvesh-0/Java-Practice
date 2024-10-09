//3. Sort the list created in 2nd problem statement first in ascending order and then descending order.
//   Display the final list in each case. Print the total number of elements in  the list.
package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pb3 {

//	public static void main(String[] args) {
//		
//		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,10,3,14,5,60,7));
//		
//		System.out.println("Ascending order : ");
//		list.stream().sorted().forEach(System.out::println);
//		
//		System.out.println("Decending order : ");
//		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		
//		System.out.println("count : "+list.stream().count()); 
//
//	}
	
	public static void main(String[] args)
    {
        // Get the Array
        int a[] = { 10, 20, 15, 22, 35 };

        // To convert the elements as List
        System.out.println("Integer Array as List: "
                           + Arrays.asList(a));
        System.out.println(a);
        // List <Integer> res = Arrays.asList(a);
        // for(int a1:res){
        //     System.out.println(" "+a1);
        // }
    }

}
